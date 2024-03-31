package entity;

public class Category {
	private int categoryId;
	private String categoryName;
	private String link;
	
	public Category() {
		super();
	}

	

	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}



	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getLink() {
	    // Trả về liên kết cố định cho mỗi danh mục
	    if (this.categoryName.equals("Trang chủ")) {
	        return "index";
	    } else if (this.categoryName.equals("Sản phẩm")) {
	        return "fruit";
	    } else if (this.categoryName.equals("Bài viết")) {
	        return "blog";
	    } else if (this.categoryName.equals("Liên hệ")) {
	        return "contact";
	    } else {
	        return "#"; // hoặc trả về một giá trị khác nếu cần
	    }
	}

	
}
