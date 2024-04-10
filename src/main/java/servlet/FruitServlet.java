
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
import dao.FruitDaoImpl;
import dao.CateFruitDaoImpl;
import entity.Category;
import entity.Fruit;
import entity.CategoryFruit;

/**
 * Servlet implementation class FruitServlet
 */
@WebServlet("/fruit")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FruitServlet() {
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

			CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			FruitDaoImpl fruitDao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			CateFruitDaoImpl cateFruitDao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());

			List<Category> list = dao.getAllCate();
			List<CategoryFruit> listCateFruit = cateFruitDao.getAllCateFruit();
			List<Fruit> lst = fruitDao.getAllFruit();

			// Lấy ID của danh mục được chọn từ request parameter (nếu có)
			String categoryIdParam = request.getParameter("categoryId");
			if (categoryIdParam != null && !categoryIdParam.isEmpty()) {
				int categoryId = Integer.parseInt(categoryIdParam);
				// Lấy danh sách sản phẩm thuộc danh mục được chọn
				List<Fruit> filteredFruits = fruitDao.getFruitsByCategoryId(categoryId);
				request.setAttribute("fruitList", filteredFruits);
			} else {
				request.setAttribute("fruitList", lst);
			}
			request.setAttribute("cateFruitList", listCateFruit);
			request.setAttribute("cateList", list);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/fruit.jsp");
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