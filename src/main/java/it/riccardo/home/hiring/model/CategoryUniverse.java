package it.riccardo.home.hiring.model;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public final class CategoryUniverse {
	
	private static  Map<String, Category> categories = new HashMap<String, Category>();
	
	private CategoryUniverse(){
		super();
	}
	
	public static void addCategory(String id, String name, Boolean isTaxFree){
		if(id == null || name == null || isTaxFree == null){
			throw new InvalidParameterException("Category parameters can not be null");
		}
		Category cat = new Category(id, name, isTaxFree);
		categories.put(id, cat);
	}
	
	public static Category getCategory(String id){
		return categories.get(id);
	}
	
	public static int getNumberOfCategories(){
		return categories.size();
	}
	
	
}
