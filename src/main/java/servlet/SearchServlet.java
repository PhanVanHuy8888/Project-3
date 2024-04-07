package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import conn.ConnectionUtils;
import dao.CateFruitDaoImpl;
import dao.CategoryDaoImpl;
import dao.FruitDaoImpl;
import entity.Category;
import entity.CategoryFruit;
import entity.Fruit;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String name = request.getParameter("timKiem");
			FruitDaoImpl fruitDao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<Category> list = dao.getAllCate();
			request.setAttribute("cateList", list);
			List<Fruit> lst = fruitDao.searchFruit(name);
			request.setAttribute("fruitList", lst);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/search.jsp");
			dispatcher.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
