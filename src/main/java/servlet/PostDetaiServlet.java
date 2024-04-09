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
import dao.CategoryDaoImpl;
import dao.PostDaoImpl;
import entity.Category;
import entity.PostTrend;


@WebServlet("/postDetail")
public class PostDetaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PostDetaiServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			CategoryDaoImpl dao1 = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<Category> lst = dao1.getAllCate();
			request.setAttribute("cateList", lst);
			PostDaoImpl dao = new PostDaoImpl(ConnectionUtils.getMSSQLConnection());

			PostTrend post = dao.getPostTrend(id);
			request.setAttribute("post", post);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/postDetail.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	

}
