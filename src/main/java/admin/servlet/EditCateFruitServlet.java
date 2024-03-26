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
import dao.CateFruitDaoImpl;
import dao.CategoryDaoImpl;
import entity.CategoryFruit;

/**
 * Servlet implementation class EditCateFruitServlet
 */
@WebServlet("/cateFruitEdit")
public class EditCateFruitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCateFruitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int categoryFruitId = Integer.parseInt(request.getParameter("id"));
            CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
            CategoryFruit cateFruit = dao.getCateFruitById(categoryFruitId);
            request.setAttribute("cateFruit", cateFruit);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin/editCateFruit.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String categoryFruitName = request.getParameter("cateFruitName");
            CategoryFruit cateFruit = new CategoryFruit();

            cateFruit.setCategoryFruitId(id);
            cateFruit.setCategoryFruitName(categoryFruitName);
            CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
            boolean f = dao.updateCateFruit(cateFruit);
            HttpSession session = request.getSession();
            if (f) {
                response.sendRedirect("cateFruitList");
            } else {
                session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
                response.sendRedirect("cateFruitEdit?id=" + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
