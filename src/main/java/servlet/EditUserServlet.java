package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import conn.ConnectionUtils;
import dao.CategoryDaoImpl;
import dao.UserDaoImpl;
import entity.Category;
import entity.User;

/**
 * Servlet implementation class EditUserServlet
 */

@WebServlet("/editUser")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<Category> list = dao.getAllCate();
			request.setAttribute("cateList", list);
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/editUser.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();

		} }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("username");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			
			User u = new User();
			u.setName(name);
			u.setEmail(email);
			u.setAddress(address);
			u.setPhone(phone);
			u.setId(id);
			
			UserDaoImpl dao = new UserDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.updateUser(u);
			if(f) {
				response.sendRedirect("index");
				session.setAttribute("success", "Cập nhật thành công");
			}else {
				response.sendRedirect("editUser?id="+ id);
				session.setAttribute("fail", "Cập nhật thất bại!");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
