package entity;

public class Fruit {
	private int fruitId;
	private String fruitName;
	private String origin;
	private float price;
	private Integer categoryFruitId;
	private String photo;
	private String description;

	public Fruit() {
		super();
	}

	public Fruit(String fruitName, String origin, float price, Integer categoryFruitId, String photo,
			String description) {
		super();
		this.fruitName = fruitName;
		this.origin = origin;
		this.price = price;
		this.categoryFruitId = categoryFruitId;
		this.photo = photo;
		this.description = description;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getCategoryFruitId() {
		return categoryFruitId;
	}

	public void setCategoryFruitId(Integer categoryFruitId) {
		this.categoryFruitId = categoryFruitId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Fruit [fruitId=" + fruitId + ", fruitName=" + fruitName + ", origin=" + origin + ", price=" + price
				+ ", categoryFruitId=" + categoryFruitId + ", photo=" + photo + ", description=" + description + "]";
	}

}
