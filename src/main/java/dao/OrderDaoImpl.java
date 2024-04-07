package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entity.Order;

public class OrderDaoImpl implements OrderDao {

	private Connection conn;

	public OrderDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}
	@Override
	public boolean saveOrder(List<Order> order) {
		try {
			String sql = "INSERT INTO `order` (orderId, username, email, address, phone, fruitName, price, pay) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

			conn.setAutoCommit(false);
			PreparedStatement p = conn.prepareStatement(sql);
			for (Order o : order) {
				p.setString(1, o.getOrderId());
				p.setString(2, o.getUsername());
				p.setString(3, o.getEmail());
				p.setString(4, o.getAddress());
				p.setString(5, o.getPhone());
				p.setString(6, o.getFruitName());
				p.setString(7, o.getPrice());
				p.setString(8, o.getPay());
				p.addBatch();
			}
			int[] count = p.executeBatch();
			conn.commit();
			conn.setAutoCommit(true);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
