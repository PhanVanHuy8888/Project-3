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
import dao.CategoryDaoImpl;

/**
 * Servlet implementation class DeleteCartServlet
 */
@WebServlet("/deleteCart")
public class DeleteCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteCartServlet() {
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
			int cid = Integer.parseInt(request.getParameter("cid"));

			CartDaoImpl dao = new CartDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.deleteCart(cid, id);
			HttpSession session = request.getSession();

			if (f) {
				String url = "checkout?id=" + id;
				response.sendRedirect(url);
			} else {
				session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("cateList");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
