package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import conn.ConnectionUtils;
import dao.BlogDaoImpl;
import dao.PostDaoImpl;
import entity.Blog;
import entity.PostTrend;

/**
 * Servlet implementation class EditPostServlet
 */
@WebServlet("/editPost")
@MultipartConfig
public class EditPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditPostServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin/editPost.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));

			String title = request.getParameter("title");
			String description = request.getParameter("description");
			Part part = request.getPart("photo");
			String realPath = getServletContext().getRealPath("/img");
			String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
			if (!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}

			PostTrend post = new PostTrend();
			post.setId(id);
			post.setTitle(title);
			post.setDescription(description);
			post.setImg(fileName);

			PostDaoImpl dao = new PostDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.updatePostTrend(post);
			if (f) {
				part.write(realPath + File.separator + fileName);
				response.sendRedirect("postList");
			} else {
				response.sendRedirect("editBlog?id=" + id);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
