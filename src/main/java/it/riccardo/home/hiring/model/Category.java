package it.riccardo.home.hiring.model;

public class Category {
	
	private String _id;
	private String name;
	private Boolean isTaxFree;
	
	
	public Category(String _id, String name, Boolean isTaxFree) {
		super();
		this._id = _id;
		this.name = name;
		this.isTaxFree = isTaxFree;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsTaxFree() {
		return isTaxFree;
	}
	public void setIsTaxFree(Boolean isTaxFree) {
		this.isTaxFree = isTaxFree;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	
	

}
