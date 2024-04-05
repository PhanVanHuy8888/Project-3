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
import dao.CateFruitDaoImpl;
import dao.CategoryDaoImpl;
import dao.FruitDaoImpl;
import entity.Category;
import entity.Fruit;

/**
 * Servlet implementation class ViewFruit
 */
@WebServlet("/viewFruit")
public class ViewFruit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewFruit() {
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
			FruitDaoImpl daoFruit = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			CateFruitDaoImpl daoCate = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());

			Fruit fruit = daoFruit.getFruitById(id);
			List<Category> list = dao.getAllCate();

			int categoryId = fruit.getCategoryFruitId();
			String categoryFruitName = daoCate.getCateFruitNameById(categoryId);
			
			request.setAttribute("categoryFruitName", categoryFruitName);
			request.setAttribute("cateList", list);
			request.setAttribute("fruit", fruit);
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/viewFruit.jsp");
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
