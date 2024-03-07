package beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author aidan - agdavidson
 * CIS175 - Spring 2024
 * Mar 4, 2024
 */
@Table(name="task")
@Entity
public class Task {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String description;
	private Boolean completed;
	/**
	 * 
	 */
	public Task() {
		super();
		this.description="None";
	}
	/**
	 * @param name
	 */
	public Task(String name) {
		super();
		this.name = name;
	}
	/**
	 * @param name
	 * @param description
	 * @param completed
	 */
	public Task(String name, String description, Boolean completed) {
		super();
		this.name = name;
		this.description = description;
		this.completed = completed;
	}
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param completed
	 */
	public Task(long id, String name, String description, Boolean completed) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.completed = completed;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the completed
	 */
	public Boolean getCompleted() {
		return completed;
	}
	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description=" + description + ", completed=" + completed + "]";
	}
	
	
	
}
