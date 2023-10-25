package br.com.contacts;

public class TaskPresenter {
	
	private Integer id;
	private String description;
	public TaskPresenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaskPresenter(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TaskPresenter [id=" + id + ", description=" + description + "]";
	}
	
	

}
