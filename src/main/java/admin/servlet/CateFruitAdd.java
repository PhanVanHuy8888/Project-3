package admin.servlet;

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
@WebServlet("/admin/cateFruitAdd")
public class CateFruitAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String categoryFruitName = request.getParameter("categoryFruitName");
			CategoryFruit cateFruit = new CategoryFruit(categoryFruitName);
			HttpSession session = request.getSession();
			CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());

			boolean f = dao.addCateFruit(cateFruit);
			if (f) {
				response.sendRedirect("listCateFruit.jsp");
			} else {
				session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("cateFruitAdd.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
