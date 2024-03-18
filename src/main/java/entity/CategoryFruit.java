package entity;

public class CategoryFruit {
	private String categoryFruitId;
	private String categoryFruitName;
	
	public CategoryFruit() {
		super();
	}

	

	public CategoryFruit(String categoryFruitId, String categoryFruitName) {
		super();
		this.categoryFruitId = categoryFruitId;
		this.categoryFruitName = categoryFruitName;
	}



	public String getCategoryFruitId() {
		return categoryFruitId;
	}

	public void setCategoryFruitId(String categoryFruitId) {
		this.categoryFruitId = categoryFruitId;
	}

	public String getCategoryFruitName() {
		return categoryFruitName;
	}

	public void setCategoryFruitName(String categoryFruitName) {
		this.categoryFruitName = categoryFruitName;
	}

	
	
	
	
}
