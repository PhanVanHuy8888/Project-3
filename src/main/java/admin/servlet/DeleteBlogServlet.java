package admin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import conn.ConnectionUtils;
import dao.BlogDaoImpl;

/**
 * Servlet implementation class DeleteBlogServlet
 */
@WebServlet("/deleteBlog")
public class DeleteBlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteBlogServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			BlogDaoImpl dao = new BlogDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.deleteBlog(id);
			if (f) {
				response.sendRedirect("blogList");
			} else {
				request.setAttribute("fail", "Xoá không thành công");
				response.sendRedirect("blogList");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
