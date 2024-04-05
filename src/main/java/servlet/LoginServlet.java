package servlet;

import jakarta.servlet.RequestDispatcher;
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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		    UserDaoImpl dao = new UserDaoImpl(ConnectionUtils.getMSSQLConnection());
		    HttpSession session = request.getSession();
		    String email = request.getParameter("email");
		    String password = request.getParameter("password");

		    if ("admin@gmail.com".equals(email) && "admin".equals(password)) {
		        User adminUser = new User();
		        adminUser.setName("Admin"); // Assuming there's a setName method in User class
		        session.setAttribute("user", adminUser);
		        response.sendRedirect("adminHome");
//		        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/admin/home.jsp");
		    } else {
		        User user = dao.login(email, password);
		        if (user != null) {
		        	
		            session.setAttribute("user", user);
		            response.sendRedirect("index");
		        } else {
		            session.setAttribute("fail", "Email hoặc mật khẩu không đúng :((");
		            response.sendRedirect("login");
		        }
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}

}
