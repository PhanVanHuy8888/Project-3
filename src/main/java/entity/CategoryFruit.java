package entity;

public class CategoryFruit {
	private int categoryFruitId;
	private String categoryFruitName;
	public CategoryFruit() {
		super();
	}
	public CategoryFruit(String categoryFruitName) {
		super();
		this.categoryFruitName = categoryFruitName;
	}
	public int getCategoryFruitId() {
		return categoryFruitId;
	}
	public void setCategoryFruitId(int categoryFruitId) {
		this.categoryFruitId = categoryFruitId;
	}
	public String getCategoryFruitName() {
		return categoryFruitName;
	}
	public void setCategoryFruitName(String categoryFruitName) {
		this.categoryFruitName = categoryFruitName;
	}
	
	
}
