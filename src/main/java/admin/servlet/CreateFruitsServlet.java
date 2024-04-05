package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.util.logging.Logger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import conn.ConnectionUtils;
import dao.CateFruitDaoImpl;
import dao.FruitDaoImpl;
import entity.CategoryFruit;
import entity.Fruit;

@WebServlet("/fruitCreate")
@MultipartConfig
public class CreateFruitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CreateFruitsServlet.class.getName());

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String errorString = null;
		try {
			CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<CategoryFruit> fruitCategories = dao.getAllCateFruit();
			request.setAttribute("errorString", errorString);
			request.setAttribute("fruitCategories", fruitCategories);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin/createFruits.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String fruitName = request.getParameter("fruitName");
			String origin = request.getParameter("origin");
			String gia = request.getParameter("price");
			String desc = request.getParameter("description");
			String name = request.getParameter("categoryFruitName");
			Part part = request.getPart("photo");
			String realPath = getServletContext().getRealPath("/img");
			String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
			if (!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}
			float price = Float.parseFloat(gia);
			CateFruitDaoImpl cateFruitdao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			int categoryFruitId = -1;
			try {
				categoryFruitId = cateFruitdao.findCategoryFruitIdByCategoryFruitName(name);
			} catch (Exception e) {
				e.printStackTrace();
			}

			Fruit fruit = new Fruit(fruitName, origin, price, categoryFruitId, fileName, desc);

			FruitDaoImpl dao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean f = dao.addFruit(fruit);
			File imgDir = new File(realPath);
			if (!imgDir.exists()) {
				imgDir.mkdirs(); // Use mkdirs() to create parent directories if necessary
			}
			if (f) {
				part.write(realPath + File.separator + fileName);
				response.sendRedirect("fruitList");
			} else {
				request.getSession().setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("fruitCreate");
			}

		} catch (Exception e) {
			e.printStackTrace();
			request.getSession().setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
			response.sendRedirect(request.getContextPath() + "fruitCreate");
		}
	}

}
