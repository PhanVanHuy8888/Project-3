package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import conn.ConnectionUtils;
import dao.CategoryDaoImpl;
import entity.Category;

/**
 * Servlet implementation class ListCateServlet
 */
@WebServlet("/admin/listCate")
public class ListCateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListCateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<Category> cate = dao.getAllCate();
			 request.setAttribute("category", cate);	
			 request.getRequestDispatcher("/admin/listCate.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

	

}
