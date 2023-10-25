package br.com.contacts;

import java.util.Objects;

public class Task {
	
	private Integer id;
	private String description;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Task(Integer id, String description) {
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
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + "]";
	}
	
	

}
