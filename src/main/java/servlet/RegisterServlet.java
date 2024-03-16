package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import conn.ConnectionUtils;
import dao.UserDaoImpl;
import entity.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/views/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");

			User us= new User();
			us.setName(name);
			us.setEmail(email);
			us.setPassword(password);
			us.setAddress(address);
			us.setPhone(phone);
			HttpSession session = request.getSession();
			
			
			UserDaoImpl dao = new UserDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.userRegis(us);
			if(f) {
			    session.setAttribute("msg", "Đăng ký thành công !!");
			    response.sendRedirect("register.jsp");
			} else {
			    session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
			    response.sendRedirect("register.jsp");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
