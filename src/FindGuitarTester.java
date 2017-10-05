/**

Class: Object-Oriented Design and Analysis
Professor: Orlando Montalvo
Assignment: HW 2 (Question 1 and 2)
Student: Radha Kumari Sharma 
GitID: radhaksha

*/

import java.util.List;


/**
 * 
 * This class is a driver class that drives the application.
 * It has main method which we use to search guitar of specific attributes.
 * initializeInventory method initialize the guitar inventory with specific guitar attributes.
 */



public class FindGuitarTester {

	/**
	 * main method. entry point for the program.
	 * @param args
	 */
  public static void main(String[] args) {
  
	  /**
	   * Set up Rick's guitar inventory
	   */
    Inventory<Guitar,Guitar.backWood> inventory = new Inventory<Guitar,Guitar.backWood>();
    
    initializeInventory(inventory);

   
    
    /**
     * Search guitar with 1 or 2 attributes and also with price
     */
    Guitar whatErinLikes = new Guitar("", 1499.95, Guitar.builder.Fender, "Stratocastor", Guitar.type.acoustic, Guitar.backWood.Alder, Guitar.topWood.Alder);
    
    List<Guitar> guitars = inventory.search(whatErinLikes);
    System.out.println("Here are all available guitars: \n");
    for(Guitar mygitar : guitars){ 	
    	if (mygitar != null) {   		
    		System.out.println("\n"+"No. "+(guitars.indexOf(mygitar)+1) +" Guitar: "+"\n");
        	System.out.println("Erin, you might like this " + mygitar.getBuilder() + " " + mygitar.getModel() +  " " +
            mygitar.getType() + " guitar:\n   " +
            mygitar.getBackWood() + " back and sides,\n   " +
            mygitar.getTopWood() + " top.\nYou can have it for only $" +
            mygitar.getPrice() + "!");	       	
      }else{
    	  System.out.println("Sorry, Erin, we have nothing for you.");
      }
    	  
    } 	
    
  }

  
  
  /**
   * 
   * @param inventory. Loads all the provided guitar types in guitar's list.
   * Initialize inventory.
   */
  
private static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("11277", 3999.95,   Guitar.builder.Collings, "CJ", Guitar.type.acoustic, Guitar.backWood.BrazilianRosewood, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("V95693", 1499.95,  Guitar.builder.Fender,  "Stratocastor", Guitar.type.acoustic, Guitar.backWood.Alder, Guitar.topWood.Alder);
    
    inventory.addGuitar("V9512", 1549.95,   Guitar.builder.Gibson, "Stratocastor", Guitar.type.electric,Guitar.backWood.IndianRosewood, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("122784", 5495.95,  Guitar.builder.Olson, "D-18", Guitar.type.acoustic,Guitar.backWood.Alder, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("76531", 6295.95,   Guitar.builder.Olson, "OM-28", Guitar.type.electric,Guitar.backWood.Cocobolo, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("70108276", 2295.95,Guitar.builder.Ryan, "Les Paul", Guitar.type.acoustic, Guitar.backWood.Alder, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("82765501", 1890.95,Guitar.builder.Ryan, "SG '61 Reissue",Guitar.type.electric, Guitar.backWood.Maple, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("77023", 6275.95,   Guitar.builder.PRS, "D-28", Guitar.type.acoustic,Guitar.backWood.Alder, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("1092", 12995.95,   Guitar.builder.Fender, "SJ", Guitar.type.electric, Guitar.backWood.Mahogany, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("566-62", 8999.95,  Guitar.builder.Gibson, "Cathedral", Guitar.type.acoustic, Guitar.backWood.Alder, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("6 29584", 2100.95, Guitar.builder.Fender, "Dave Navarro Signature", Guitar.type.acoustic, Guitar.backWood.Alder, Guitar.topWood.BrazilianRosewood);
    
    inventory.addGuitar("6 29585", 1499.95, Guitar.builder.Fender, "Stratocastor", Guitar.type.acoustic, Guitar.backWood.Alder, Guitar.topWood.Alder);
  
  }
  
  
}
