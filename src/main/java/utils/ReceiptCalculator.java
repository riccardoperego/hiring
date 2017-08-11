package utils;

import it.riccardo.home.hiring.model.CategoryUniverse;
import it.riccardo.home.hiring.model.Item;
import it.riccardo.home.hiring.model.Receipt;

public final class ReceiptCalculator {
	
	public static Receipt calculateReceipt(Receipt receipt){
		
		Double totalCost = 0.0;
		Double totalAmountOfSalesTaxes = 0.0;
		
		for(Item item : receipt.getItems()){
			totalCost += calculateGrossPrice(item);
			totalAmountOfSalesTaxes += item.getTotalPrice() - item.getNetPrice();
		}
		
		receipt.setTotalAmountOfSalesTaxes(Math.round(totalAmountOfSalesTaxes*100)/100.0);
		receipt.setTotalCost((Math.round(totalCost*100)/100.0));
		
		
		return receipt;
		
	}
	
	private static Double calculateGrossPrice(Item item){
		Double grossPrice = 0.0;
		Double taxRate = 0.0;
		// check if isTaxFree
		if(!CategoryUniverse.getCategory(item.getCategoryId()).getIsTaxFree()){
			taxRate = Constants.BASIC_TAX;
		}
		if(item.getIsImported()){
			taxRate += Constants.IMPORT_TAX;
		}
		
		// calculate grossPrice
		grossPrice = item.getNetPrice() + calculateRoundedSalesTax(item.getNetPrice(), taxRate);
		
		item.setTotalPrice((Math.round(grossPrice*100)/100.0));
		
		return grossPrice;
	}
	
	private static Double calculateRoundedSalesTax(Double netPrice, Double taxRate){
		
		Double salesTax = 0.0;
		
		salesTax = netPrice * taxRate;
		
		salesTax = ((double) (5 * (Math.ceil(salesTax*100/5)))/100);
		
		return salesTax;
		
	}
	
	
	
}
