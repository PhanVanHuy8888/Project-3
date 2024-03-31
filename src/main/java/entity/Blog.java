package entity;

public class Blog {
	private int id;
	private String title;
	private String description;
	
	
	public Blog() {
		super();
	}


	public Blog(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}