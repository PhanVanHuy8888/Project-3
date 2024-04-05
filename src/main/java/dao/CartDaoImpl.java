package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Cart;
import entity.CategoryFruit;

public class CartDaoImpl implements CartDao {

	private Connection conn;

	public CartDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean addCart(Cart c) {
		try {
			String sql = "insert into cart(fruitId,userId,fruitName,origin,price,total) values(?,?,?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, c.getFruitId());
			pstm.setInt(2, c.getUserId());
			pstm.setString(3, c.getFruitName());
			pstm.setString(4, c.getOrigin());
			pstm.setDouble(5, c.getPrice());
			pstm.setDouble(6, c.getTotalPrice());

			int i = pstm.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Cart> getCartByUser(int userId) {
		List<Cart> lst = new ArrayList<Cart>();
		Cart c = null;
		double totalPrice = 0;

		try {
			String sql = "SELECT * FROM cart WHERE userId=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, userId);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				c = new Cart();
				c.setCartId(rs.getInt(1));
				c.setFruitId(rs.getInt(2));
				c.setUserId(rs.getInt(3));
				c.setFruitName(rs.getString(4));
				c.setOrigin(rs.getString(5));
				c.setPrice(rs.getDouble(6));
				totalPrice = totalPrice + rs.getDouble(7);
				c.setTotalPrice(totalPrice);
				lst.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return lst;
	}

	@Override
	public boolean deleteCart(int cartId, int userId) {
		try {
			String sql = "DELETE FROM cart WHERE cartId = ? AND userId = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, cartId);
			pstm.setInt(2, userId);
			int i = pstm.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// Xử lý các loại ngoại lệ khác nếu cần
		}
		return false;
	}

}
