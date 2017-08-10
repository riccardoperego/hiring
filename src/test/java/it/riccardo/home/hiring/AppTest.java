package it.riccardo.home.hiring;

import it.riccardo.home.hiring.model.Basket;
import it.riccardo.home.hiring.model.CategoryUniverse;
import it.riccardo.home.hiring.model.Item;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    
    
    public void testCategories(){
    	CategoryUniverse.addCategory("1", "food", true);
    	CategoryUniverse.addCategory("2", "cosmetics", false);
    	CategoryUniverse.addCategory("3", "music", false);
    	CategoryUniverse.addCategory("4", "books", true);
    	CategoryUniverse.addCategory("5", "medical product", true);
    	    	
    	assertEquals(5, CategoryUniverse.getNumberOfCategories());
    	assertEquals("food", CategoryUniverse.getCategory("1").getName());
    }
    
    public void testBasket(){
    	this.testCategories();
    	Basket basket = new Basket();
    	Item item1 = new Item("Book", "4", 12.49, false);
    	Item item2 = new Item("Music CD", "3", 14.99, false);
    	Item item3 = new Item("Chocolate Bar", "1", 0.85, false);
    	basket.addItem(item1);
    	basket.addItem(item2);
    	basket.addItem(item3);
    	
    	assertEquals(3, basket.getListOfItems().size());
    	assertEquals("Music CD", basket.getListOfItems().get(1).getName());    	

    }
}
