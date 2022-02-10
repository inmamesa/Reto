package model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {

	@Id
	private String Id;
	@Column
	private String name;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
