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
import dao.CategoryDaoImpl;

/**
 * Servlet implementation class DeleteCateFruit
 */
@WebServlet("/deleteCateFruit")
public class DeleteCateFruitServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));

			CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.deleteCateFruit(id);
			HttpSession session = request.getSession();

			if (f) {
				response.sendRedirect("cateFruitList");
			} else {
				session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("cateFruitList");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
