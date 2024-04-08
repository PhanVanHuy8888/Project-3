package admin.servlet;

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
import dao.PostDaoImpl;
import entity.Blog;
import entity.PostTrend;

/**
 * Servlet implementation class ListPostTrend
 */
@WebServlet("/postList")
public class ListPostTrendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListPostTrendServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String error = null;
		try {
			PostDaoImpl dao = new PostDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<PostTrend> lst = dao.getAllPostTrend();
			request.setAttribute("error", error);
			request.setAttribute("postList", lst);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin/listPost.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
