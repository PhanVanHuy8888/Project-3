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
import entity.Category;

/**
 * Servlet implementation class OrderSuccess
 */
@WebServlet("/orderSuccess")
public class OrderSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<Category> list = dao.getAllCate();
			request.setAttribute("cateList", list);
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/orderSuccess.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
