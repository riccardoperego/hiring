package it.riccardo.home.hiring;

import it.riccardo.home.hiring.model.Basket;
import it.riccardo.home.hiring.model.CategoryUniverse;
import it.riccardo.home.hiring.model.Item;
import it.riccardo.home.hiring.model.Receipt;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import utils.ReceiptCalculator;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     * Test static categories
     */
    public void testCategories(){
    	CategoryUniverse.addCategory("1", "food", true);
    	CategoryUniverse.addCategory("2", "cosmetics", false);
    	CategoryUniverse.addCategory("3", "music", false);
    	CategoryUniverse.addCategory("4", "books", true);
    	CategoryUniverse.addCategory("5", "medical product", true);
    	    	
    	assertEquals(5, CategoryUniverse.getNumberOfCategories());
    	assertEquals("food", CategoryUniverse.getCategory("1").getName());
    }
    
    /**
     * Test basket items
     */
    public void testBasket(){
    	// populate categories
    	this.testCategories();
    	
    	Basket basket = new Basket();
    	// create items
    	Item item1 = new Item("Book", "4", 12.49, false);
    	Item item2 = new Item("Music CD", "3", 14.99, false);
    	Item item3 = new Item("Chocolate Bar", "1", 0.85, false);
    	
    	basket.addItem(item1);
    	basket.addItem(item2);
    	basket.addItem(item3);
    	// test basket items
    	assertEquals(3, basket.getListOfItems().size());
    	assertEquals("Music CD", basket.getListOfItems().get(1).getName());    	

    }
    
    /**
     * test calculator
     */
    
    public void testCalculator(){
    	// populate static categories
    	this.testCategories();
    	
    	System.out.println("Init test for calculator");
    	
    	// create items
    	Item item1 = new Item("1 Book", "4", 12.49, false);
    	Item item2 = new Item("1 Music CD", "3", 14.99, false);
    	Item item3 = new Item("1 Chocolate Bar", "1", 0.85, false);
    	
    	Item item4 = new Item("1 Imported box of chocolates", "1", 10.00, true);
    	Item item5 = new Item("1 Imported bottle of perfume", "2", 47.50, true);
    	
    	Item item6 = new Item("1 Imported bottle of perfume", "2", 27.99, true);
    	Item item7 = new Item("1 Bottle of perfume ", "2", 18.99, false);
    	Item item8 = new Item("1 Packet of headache pills ", "5", 9.75, false);
    	Item item9 = new Item("1 Box of imported chocolates", "1", 11.25, true);
    	
    	// create receipts
    	Receipt receipt = new Receipt();
    	receipt.addItem(item1);
    	receipt.addItem(item2);
    	receipt.addItem(item3);
    	
    	Receipt receipt2 = new Receipt();
    	receipt2.addItem(item4);
    	receipt2.addItem(item5);
    	
    	Receipt receipt3 = new Receipt();
    	receipt3.addItem(item6);
    	receipt3.addItem(item7);
    	receipt3.addItem(item8);
    	receipt3.addItem(item9);
    	
    	// calculate and print receipts
    	System.out.println("\n---- \t ---- \t ----\n");
    	receipt = ReceiptCalculator.calculateReceipt(receipt);
    	System.out.println(receipt.toString());
    	System.out.println("\n---- \t ---- \t ----\n");
    	
    	receipt2 = ReceiptCalculator.calculateReceipt(receipt2);
    	System.out.println(receipt2.toString());
    	System.out.println("\n---- \t ---- \t ----\n");
    	
    	receipt3 = ReceiptCalculator.calculateReceipt(receipt3);
    	System.out.println(receipt3.toString());
    	System.out.println("\n---- \t ---- \t ----\n");
    	
    }

    /*public void testRoundingRulesLogic(){
    	Double net = 47.50;
    	Double taxPercentage = 0.15;
    	Double salesTax = net * taxPercentage;
    	
    	System.out.println(salesTax);
    	salesTax = ((double) (5 * (Math.round(salesTax*100/5)))/100);
    	
    	System.out.println(salesTax);	
    }*/
}
