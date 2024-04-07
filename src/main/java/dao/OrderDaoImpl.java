package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

	@Override
	public List<Order> getOrderByEmail(String email) {
		List<Order> lst = new ArrayList<Order>();
		try {
			String sql = "Select orderId, fruitName, price, pay from orders where email=?";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, email);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				Order o = new Order();
				o.setOrderId(rs.getString(1));
				o.setFruitName(rs.getString(2));
				o.setPrice(rs.getString(3));
				o.setPay(rs.getString(4));
				lst.add(o);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public List<Order> getAllOrder() {
		List<Order> lst = new ArrayList<Order>();
		try {
			String sql = "Select orderId, username, email, address, phone, fruitName, price, pay from orders";
			PreparedStatement p = conn.prepareStatement(sql);
			
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				Order o = new Order();
				o.setOrderId(rs.getString(1));
				o.setUsername(rs.getString(2));
				o.setEmail(rs.getString(3));
				o.setAddress(rs.getString(4));
				o.setPhone(rs.getString(5));
				o.setFruitName(rs.getString(6));
				o.setPrice(rs.getString(7));
				o.setPay(rs.getString(8));
				lst.add(o);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

}
