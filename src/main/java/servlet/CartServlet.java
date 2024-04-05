package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import conn.ConnectionUtils;
import dao.CartDaoImpl;
import dao.FruitDaoImpl;
import entity.Cart;
import entity.Fruit;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
			
		try {
			String id = (String) request.getParameter("id");
			
			String uid = (String) request.getParameter("uid");
			
			
			int fruitId = 0;
			int userId = 0;
			
			try {
				fruitId = Integer.parseInt(id);
				userId = Integer.parseInt(uid);
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			FruitDaoImpl dao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			Fruit fruit = dao.getFruitById(fruitId);
			request.setAttribute("fruit", fruit);
			Cart c = new Cart();
			c.setFruitId(fruitId);
			c.setUserId(userId);
			c.setFruitName(fruit.getFruitName());
			c.setOrigin(fruit.getOrigin());	
			c.setPrice(fruit.getPrice());
			c.setTotalPrice(fruit.getPrice());
			
			
			CartDaoImpl cart = new CartDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = cart.addCart(c);
			HttpSession session = request.getSession();
			if(f) {
				session.setAttribute("addCart", "Thêm vào giỏ hàng thành công");
				response.sendRedirect("fruit");
				
			}else {
				session.setAttribute("fail", "Thêm vào giỏ hàng thất bại");
				response.sendRedirect("viewFruit");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
