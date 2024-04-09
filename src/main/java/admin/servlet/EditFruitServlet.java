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
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Files;

import conn.ConnectionUtils;
import dao.CateFruitDaoImpl;
import dao.CategoryDaoImpl;
import dao.FruitDaoImpl;
import entity.Category;
import entity.CategoryFruit;
import entity.Fruit;

@WebServlet("/fruitEdit")
@MultipartConfig
public class EditFruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditFruitServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			CateFruitDaoImpl cateFruitDao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			List<CategoryFruit> fruitCategories = cateFruitDao.getAllCateFruit();
			request.setAttribute("fruitCategories", fruitCategories);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin/editFruit.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			// Xử lý exception
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			
			String fruitName = request.getParameter("fruitName");
			String origin = request.getParameter("origin");
			Float price = Float.parseFloat(request.getParameter("price"));
			Part part = request.getPart("photo");
			String desc = request.getParameter("description");
			String name = request.getParameter("categoryFruitName");
			
			String realPath = getServletContext().getRealPath("/img");
			String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
			if (!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}

			CateFruitDaoImpl cateFruitDao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			int categoryFruitId = -1;
			if (name != null && !name.isEmpty()) {
				categoryFruitId = cateFruitDao.findCategoryFruitIdByCategoryFruitName(name);
			}

			

			Fruit fruit = new Fruit();
			fruit.setFruitId(id);
			fruit.setFruitName(fruitName);
			fruit.setOrigin(origin);
			fruit.setPrice(price);
			fruit.setPhoto(fileName);
			fruit.setCategoryFruitId(categoryFruitId);
			fruit.setDescription(desc);

			FruitDaoImpl dao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean success = dao.updateFruit(fruit);

			if (success) {
				part.write(realPath + File.separator + fileName);
				response.sendRedirect("fruitList");
			} else {
				request.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("fruitEdit?id=" + id);
			}
		}catch (Exception e) {
			e.printStackTrace();
			// Xử lý exception
		}
	}

}
