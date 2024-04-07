package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import conn.ConnectionUtils;
import dao.CartDaoImpl;
import dao.CategoryDaoImpl;
import dao.OrderDaoImpl;
import entity.Cart;
import entity.Category;
import entity.Order;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderServlet() {
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
			
			String email = request.getParameter("email");
			OrderDaoImpl dao1 = new OrderDaoImpl(ConnectionUtils.getMSSQLConnection());
			CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<Category> list = dao.getAllCate();
			List<Order> lst = dao1.getOrderByEmail(email);
			System.out.println(lst);
			request.setAttribute("orderList", lst);
			request.setAttribute("cateList", list);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/order.jsp");
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
		try {
			HttpSession session = request.getSession();
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("username");
			String email = request.getParameter("email");
			String address = request.getParameter("fullAdd");
			String phone = request.getParameter("phone");
			String pay = request.getParameter("pay");

			CartDaoImpl cart = new CartDaoImpl(ConnectionUtils.getMSSQLConnection());
			OrderDaoImpl dao = new OrderDaoImpl(ConnectionUtils.getMSSQLConnection());

			List<Cart> lst = cart.getCartByUser(id);
			Order o = new Order();
			ArrayList<Order> listOrder = new ArrayList<Order>();
			Random r = new Random();
			for (Cart c : lst) {
				o.setOrderId("FRUIT-00" + r.nextInt(1000));
				o.setUsername(name);
				o.setEmail(email);
				o.setAddress(address);
				o.setPhone(phone);
				o.setFruitName(c.getFruitName());
				o.setPrice(c.getPrice() + "");
				o.setPay(pay);
				listOrder.add(o);
			}

			if ("noselect".equals(pay)) {
				session.setAttribute("fail", "Vui lòng chọn phương thức thanh toán");
				String url = "checkout?id=" + id;
				response.sendRedirect(url);
			} else {
				boolean f = dao.saveOrder(listOrder);
				response.sendRedirect("orderSuccess");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
