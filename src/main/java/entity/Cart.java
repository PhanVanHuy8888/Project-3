package entity;

public class Cart {
	private int cartId;
	private int fruitId;
	private int userId;
	private String fruitName;
	private String origin;
	private double price;
	private double totalPrice;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Cart() {
		super();
	}

	public Cart(int fruitId, int userId, String fruitName, String origin, double price, double totalPrice) {
		super();
		this.fruitId = fruitId;
		this.userId = userId;
		this.fruitName = fruitName;
		this.origin = origin;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getFruitId() {
		return fruitId;
	}

	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
