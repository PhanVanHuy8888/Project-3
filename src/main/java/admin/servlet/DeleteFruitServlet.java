package admin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import conn.ConnectionUtils;
import dao.FruitDaoImpl;

/**
 * Servlet implementation class DeleteFruit
 */
@WebServlet("/deleteFruit")
public class DeleteFruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			FruitDaoImpl dao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.deleteFruit(id);
			HttpSession session = request.getSession();
			
			if(f) {
				response.sendRedirect("fruitList");
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}


}
