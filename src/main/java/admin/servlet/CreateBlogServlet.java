package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import conn.ConnectionUtils;
import dao.BlogDaoImpl;
import entity.Blog;

/**
 * Servlet implementation class CreateBlogServlet
 */
@WebServlet("/blogCreate")
@MultipartConfig
public class CreateBlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateBlogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/admin/createBlog.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String title = request.getParameter("title");
			String desc = request.getParameter("description");	
			
			Part part = request.getPart("photo");
			System.out.println(part);
			String realPath = getServletContext().getRealPath("/img");
			String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
			if (!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}
			Blog blog = new Blog(title, desc, fileName);

			BlogDaoImpl dao = new BlogDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.addBlog(blog);
			File imgDir = new File(realPath);
			if (!imgDir.exists()) {
				imgDir.mkdirs(); // Use mkdirs() to create parent directories if necessary
			}
			if (f) {
				part.write(realPath + File.separator + fileName);
				response.sendRedirect("blogList");
			} else {
				request.getSession().setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("blogCreate");
			}

		} catch (Exception e) {
			e.printStackTrace();
			request.getSession().setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
			response.sendRedirect(request.getContextPath() + "blogCreate");
		}
	}

}
