package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import conn.ConnectionUtils;
import dao.BlogDaoImpl;
import dao.CategoryDaoImpl;
import dao.PostDaoImpl;
import entity.Blog;
import entity.Category;
import entity.PostTrend;

/**
 * Servlet implementation class BlogServlet
 */
@WebServlet("/blog")
public class BlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BlogServlet() {
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
			BlogDaoImpl dao1 = new BlogDaoImpl(ConnectionUtils.getMSSQLConnection());
			PostDaoImpl dao2 = new PostDaoImpl(ConnectionUtils.getMSSQLConnection());
			CategoryDaoImpl dao3 = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<Blog> lst = dao1.getAllBlog();
			List<PostTrend> list = dao2.getAllPostTrend();	
			List<Category> lt = dao3.getAllCate();
			
			request.setAttribute("cateList", lt);
			request.setAttribute("blogList", lst);
			request.setAttribute("postList", list);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/blog.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
