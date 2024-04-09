package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import conn.ConnectionUtils;
import dao.OrderDaoImpl;
import entity.Order;

/**
 * Servlet implementation class OrderDetailServlet
 */
@WebServlet("/detailOrder")
public class OrderDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderDetailServlet() {
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
			OrderDaoImpl dao = new OrderDaoImpl(ConnectionUtils.getMSSQLConnection());
			Order o = dao.getOrderById(id);
			request.setAttribute("order", o);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/admin/orderDetail.jsp");
			dispatcher.forward(request, response);
		
		}catch(Exception e ) {
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
