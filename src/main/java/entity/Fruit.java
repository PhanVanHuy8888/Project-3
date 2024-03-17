package entity;

public class Fruit {
	private int fruitId;
	private String fruitName;
	private String origin;
	private String price;
	private String fruitCategory;
	private String photo;

	public Fruit() {
		super();
	}
	
	public Fruit(String fruitName, String origin, String price, String fruitCategory, String photo) {
		super();
		this.fruitName = fruitName;
		this.origin = origin;
		this.price = price;
		this.fruitCategory = fruitCategory;
		this.photo = photo;
	}

	public int getFruitId() {
		return fruitId;
	}
	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFruitCategory() {
		return fruitCategory;
	}
	public void setFruitCategory(String fruitCategory) {
		this.fruitCategory = fruitCategory;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
}
