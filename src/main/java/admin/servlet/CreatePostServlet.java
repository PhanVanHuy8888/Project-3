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
 * Servlet implementation class CreatePostServlet
 */
@WebServlet("/postCreate")
@MultipartConfig
public class CreatePostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreatePostServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/admin/createPost.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String title = request.getParameter("title");
			String desc = request.getParameter("description");

			Part part = request.getPart("photo");
			
			String realPath = getServletContext().getRealPath("/img");
			String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
			if (!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}
			PostTrend post = new PostTrend(title, desc, fileName);

			PostDaoImpl dao = new PostDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.addPostTrend(post);
			File imgDir = new File(realPath);
			if (!imgDir.exists()) {
				imgDir.mkdirs(); 
			}
			if (f) {
				part.write(realPath + File.separator + fileName);
				response.sendRedirect("postList");
			} else {
				request.getSession().setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("postCreate");
			}

		} catch (Exception e) {
			e.printStackTrace();
			request.getSession().setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
			response.sendRedirect(request.getContextPath() + "postCreate");
		}
	}

}
