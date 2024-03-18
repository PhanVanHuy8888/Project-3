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
 * Servlet implementation class CateFruitAdd
 */
@WebServlet("/admin/cateFruitAdd")
public class CateFruitAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CateFruitAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String categoryFruitId = request.getParameter("cateFruitId");
			String categoryFruitName = request.getParameter("cateFruitName");
			CategoryFruit cateFruit = new CategoryFruit(categoryFruitId, categoryFruitName);
			HttpSession session = request.getSession();
			CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());

			boolean f = dao.addCateFruit(cateFruit);
			if (f) {
				response.sendRedirect("listCateFruit.jsp");
			} else {
				session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("cateFruitAdd.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
