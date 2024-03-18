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
import entity.Category;
import entity.CategoryFruit;

/**
 * Servlet implementation class EditCateServlet
 */
@WebServlet("/editCate")
public class EditCateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String categoryName = request.getParameter("categoryName");

			Category cate = new Category();
			cate.setCategoryId(id);
			cate.setCategoryName(categoryName);
			CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.updateCate(cate);
			HttpSession session = request.getSession();
			if (f) {
				response.sendRedirect("admin/listCate.jsp");
			} else {
				session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("admin/cateEdit.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
