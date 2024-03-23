package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import conn.ConnectionUtils;
import dao.CategoryDaoImpl;
import dao.FruitDaoImpl;
import entity.Category;

/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/cateCreate")
public class CreateCateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateCateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/admin/createCate.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String categoryName = request.getParameter("categoryName");
			Category cate = new Category(categoryName);
			HttpSession session = request.getSession();
			CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());

			boolean f = dao.addCate(cate);
			if (f) {
				response.sendRedirect("cateList");
			} else {
				session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("admin/createCate");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
