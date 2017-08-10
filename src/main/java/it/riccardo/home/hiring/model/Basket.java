package it.riccardo.home.hiring.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	private List<Item> itemsToBuy = new ArrayList<Item>();

	public void addItem(Item item){
		itemsToBuy.add(item);
	}
	public List<Item> getListOfItems(){
		return itemsToBuy;
	}

}
