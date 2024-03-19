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
import entity.CategoryFruit;

/**
 * Servlet implementation class ListCaFruit
 */
 @WebServlet("/admin/fruitsAdd")
public class ListCaFruit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListCaFruit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Gọi phương thức để truy vấn danh sách loại trái cây từ CSDL
		try {
			CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
	        List<CategoryFruit> fruitCategories = dao.getAllCateFruit() ;// FruitDAO là lớp truy vấn CSDL
	        request.setAttribute("fruitCategories", fruitCategories);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/listFruits.jsp");
	        dispatcher.forward(request, response);
	  
		}  catch (Exception e) {
			e.printStackTrace();
		}
      // Đặt danh sách loại trái cây vào request attribute
       
        
        // Chuyển yêu cầu tới JSP
      }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
