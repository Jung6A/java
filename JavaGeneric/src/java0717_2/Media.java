package java0717_2;

public class Media {
	private String id; //包府锅龋
	private String title; //力格
	
	public Media() {}
	
	public Media(String id,String title) {
		this.id=id;
		this.title=title;
	}
	
	@Override
	public String toString() {
		return "ID: "+id+", 力格: "+title;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
