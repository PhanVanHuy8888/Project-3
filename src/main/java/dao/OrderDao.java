package dao;

import java.util.List;

import entity.Order;

public interface OrderDao {
	public boolean saveOrder(List<Order> order);
	public List<Order> getOrderByEmail(String email);
	public List<Order> getAllOrder();
}
