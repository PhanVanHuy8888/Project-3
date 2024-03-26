package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import conn.ConnectionUtils;
import dao.CateFruitDaoImpl;
import entity.CategoryFruit;

/**
 * Servlet implementation class CateFruitAdd
 */
@WebServlet("/cateFruitCreate")
public class CreateCateFruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/admin/createCateFruit.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String categoryFruitName = request.getParameter("categoryFruitName");
			CategoryFruit cateFruit = new CategoryFruit(categoryFruitName);
			HttpSession session = request.getSession();
			CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());

			boolean f = dao.addCateFruit(cateFruit);
			if (f) {
				response.sendRedirect("cateFruitList");
			} else {
				session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("cateFruitCreate");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
