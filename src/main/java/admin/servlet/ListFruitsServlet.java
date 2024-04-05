package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import conn.ConnectionUtils;
import dao.CategoryDaoImpl;
import dao.FruitDaoImpl;
import entity.Fruit;

/**
 * Servlet implementation class ListFruits
 */
@WebServlet("/fruitList")
public class ListFruitsServlet extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errorString = null;
		List<Fruit> list = null;
		try {
			FruitDaoImpl dao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			try {
				list = dao.getAllFruit();
				request.setAttribute("fruitList", list);
				RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/WEB-INF/admin/listFruits.jsp");
				dispatcher.forward(request, response);
			} catch (Exception e) {			
				e.printStackTrace();
			}
		}catch (ClassNotFoundException| SQLException e1) {
			e1.printStackTrace();
			errorString = e1.getMessage();
			
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/admin/listFruits.jsp");
			request.setAttribute("errorString", errorString);
			dispatcher.forward(request, response);
			e1.printStackTrace();
		}
	}


}
