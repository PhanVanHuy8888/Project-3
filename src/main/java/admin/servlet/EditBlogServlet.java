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
import entity.Blog;

/**
 * Servlet implementation class EditBlogServlet
 */
@WebServlet("/editBlog")
@MultipartConfig
public class EditBlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditBlogServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin/editBlog.jsp");
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

			Blog blog = new Blog();
			blog.setId(id);
			blog.setTitle(title);
			blog.setDescription(description);
			blog.setImage(fileName);

			BlogDaoImpl dao = new BlogDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.updateBlog(blog);
			if (f) {
				part.write(realPath + File.separator + fileName);
				response.sendRedirect("blogList");
			} else {
				response.sendRedirect("editBlog?id=" + id);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
