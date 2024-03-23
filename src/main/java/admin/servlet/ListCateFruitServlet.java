package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import conn.ConnectionUtils;
import dao.CateFruitDaoImpl;
import entity.Category;
import entity.CategoryFruit;

/**
 * Servlet implementation class ListCaFruit
 */
 @WebServlet("/cateFruitList")
public class ListCateFruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListCateFruitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errorString = null;
		
		try {
			CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
	        List<CategoryFruit> fruitCategories = dao.getAllCateFruit() ;
	        request.setAttribute("errorString", errorString);
	        request.setAttribute("fruitCategories", fruitCategories);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin/listCateFruit.jsp");
	        dispatcher.forward(request, response);
	  
		}  catch (Exception e) {
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
