package entity;

public class PostTrend {
	private int id;
	private String title;
	private String description;
	private String img;

	public PostTrend() {
		super();
	}

	public PostTrend(String title, String description, String img) {
		super();
		
		this.title = title;
		this.description = description;
		this.img = img;
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
