package admin.servlet;

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
@WebServlet("/admin/cateAdd")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CategoryServlet() {
		super();
		// TODO Auto-generated constructor stub
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
				response.sendRedirect("listCate.jsp");
			} else {
				session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("cateAdd.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
