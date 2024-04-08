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
import dao.CategoryDaoImpl;
import entity.Category;

@WebServlet("/editCate")
public class EditCateServlet extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int categoryId = Integer.parseInt(request.getParameter("id"));
            CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
            Category cate = dao.getCateById(categoryId);
            request.setAttribute("cate", cate);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin/editCate.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String categoryName = request.getParameter("categoryName");

            Category cate = new Category();
            cate.setCategoryId(id);
            cate.setCategoryName(categoryName);
            
            CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
            boolean success = dao.updateCate(cate);
            HttpSession session = request.getSession();
            if (success) {
                response.sendRedirect("cateList");
            } else {
                session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
                response.sendRedirect("editCate?id=" + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exception
        }
    }
}
