package admin.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import conn.ConnectionUtils;
import dao.CateFruitDaoImpl;
import dao.CategoryDaoImpl;
import dao.FruitDaoImpl;
import entity.Category;
import entity.CategoryFruit;
import entity.Fruit;

@WebServlet("/fruitEdit")
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

			String idParam = request.getParameter("id");
			if (idParam != null && !idParam.isEmpty()) {
				int fruitId = Integer.parseInt(idParam);
				FruitDaoImpl dao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
				Fruit fruit = dao.getFruitById(fruitId);
				if (fruit != null) {
					request.setAttribute("fruit", fruit);
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin/editFruit.jsp");
					dispatcher.forward(request, response);
				} else {
					// Xử lý khi không tìm thấy trái cây với id đã cung cấp
					// Ví dụ: chuyển hướng hoặc hiển thị thông báo lỗi
					response.sendRedirect("fruitList");
				}
			} else {
				// Xử lý khi không có tham số "id"
				// Ví dụ: chuyển hướng hoặc hiển thị thông báo lỗi
				response.sendRedirect("fruitList");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// Xử lý exception
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String idParam = request.getParameter("id");
			if (idParam == null || idParam.isEmpty()) {
				// Nếu id không được gửi, chuyển hướng hoặc xử lý lỗi ở đây
				response.sendRedirect("fruitList");
				return; // Kết thúc phương thức để tránh tiếp tục thực thi code dưới
			}

			int id = Integer.parseInt(idParam);
			String fruitName = request.getParameter("fruitName");
			String origin = request.getParameter("origin");
			Float price = Float.parseFloat(request.getParameter("price"));
			String photo = request.getParameter("photo");
			String name = request.getParameter("categoryFruitName");

			CateFruitDaoImpl cateFruitDao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			int categoryFruitId = -1;
			if (name != null && !name.isEmpty()) {
				categoryFruitId = cateFruitDao.findCategoryFruitIdByCategoryFruitName(name);
			}

			String desc = request.getParameter("description");

			Fruit fruit = new Fruit();
			fruit.setFruitId(id);
			fruit.setFruitName(fruitName);
			fruit.setOrigin(origin);
			fruit.setPrice(price);
			fruit.setPhoto(photo);
			fruit.setCategoryFruitId(categoryFruitId);
			fruit.setDescription(desc);

			FruitDaoImpl dao = new FruitDaoImpl(ConnectionUtils.getMSSQLConnection());
			boolean success = dao.updateFruit(fruit);

			HttpSession session = request.getSession();
			if (success) {
				response.sendRedirect("fruitList");
			} else {
				session.setAttribute("fail", "Lỗi vui lòng kiểm tra lại :((");
				response.sendRedirect("editCate?id=" + id);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// Xử lý exception
		}
	}

}
