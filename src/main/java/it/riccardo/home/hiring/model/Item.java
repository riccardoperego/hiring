package it.riccardo.home.hiring.model;

public class Item {

	private String name;
	private String categoryId;
	private Double netPrice;
	private Boolean isImported;
	private Double totalPrice;
	
	public Item(String name, String categoryId, Double netPrice,
			Boolean isImported) {
		super();
		this.name = name;
		this.categoryId = categoryId;
		this.netPrice = netPrice;
		this.isImported = isImported;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(Double netPrice) {
		this.netPrice = netPrice;
	}
	public Boolean getIsImported() {
		return isImported;
	}
	public void setIsImported(Boolean isImported) {
		this.isImported = isImported;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
