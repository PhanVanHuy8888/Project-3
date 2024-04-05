package dao;

import java.util.List;

import entity.Cart;

public interface CartDao {
	public boolean addCart(Cart c);

	public List<Cart> getCartByUser(int userId);

	public boolean deleteCart(int cartId, int userId);
}
