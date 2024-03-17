package admin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

import conn.ConnectionUtils;
import dao.FruitDaoImpl;
import entity.Fruit;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class FruitsAdd
 */
@WebServlet("/admin/FruitsAdd")
public class FruitsAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FruitsAdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String fruitName = request.getParameter("fruitName");
			String origin = request.getParameter("origin");
			String price = request.getParameter("price");
			String categoryFruitId = request.getParameter("categoryFruitId");
			Part part = request.getPart("photo");
			String fileName = part.getSubmittedFileName();
			Fruit fruit = new Fruit(fruitName, origin, price, categoryFruitId, fileName);
			HttpSession session = request.getSession();
			
			FruitDaoImpl dao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			
			boolean f = dao.addFruit(fruit);
			if(f) {
			    
			    response.sendRedirect("listFruit.jsp");
			} else {
			    session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
			    response.sendRedirect("FruitsAdd.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
