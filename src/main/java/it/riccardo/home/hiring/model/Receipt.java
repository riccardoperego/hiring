package it.riccardo.home.hiring.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Receipt {
	private List<Item> items = new ArrayList<Item>();
	private Double totalCost = 0.0;
	private Double totalAmountOfSalesTaxes = 0.0;
	
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	public Double getTotalAmountOfSalesTaxes() {
		return totalAmountOfSalesTaxes;
	}
	public void setTotalAmountOfSalesTaxes(Double totalAmountOfSalesTaxes) {
		this.totalAmountOfSalesTaxes = totalAmountOfSalesTaxes;
	}
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public String toString(){
		String receiptDescription = "";
		for(Item item : items){
			receiptDescription = receiptDescription.concat(item.getName() + ":\t" + String.format(Locale.US, "%.2f", item.getTotalPrice()) + "\n");
		}
		receiptDescription = receiptDescription.concat("Sales taxes:\t" + String.format(Locale.US, "%.2f", getTotalAmountOfSalesTaxes()) + "\n");
		receiptDescription = receiptDescription.concat("Total:\t" + String.format(Locale.US, "%.2f", getTotalCost()));
		
		return receiptDescription;
		
	}
	
}
