/**

Class: Object-Oriented Design and Analysis
Professor: Orlando Montalvo
Assignment: HW 2 
Student: Radha Kumari Sharma 
GitID: radhaksha

*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




/**
 * This class helps to create Guitar Inventory objects.
 * Below methods are present in the class.
 * 
 * addGuitar Method - adds guitars objects to the guitars list
 * getGuitar Method - gets guitar object when looked for guitar with a serial number
 * search    Method  - searches if specific guitar is present in list. @Returns ArrayList
 */


public class Inventory<Guitars> {
 

	/**
	 * guitars declared as List
	 */
	
	public List<Guitar> guitars;


  
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

  
	/**
	 * This method adds new guitars to the list guitars.
	 * @param serialNumber,this is the serial Number of  guitar.
	   * @param price. This is the price of guitar.
	   * @param builder. This is the builder of guitar
	   * @param model. This is the model name of the guitar.
	   * @param type. This is the type of guitar.
	   * @param backWood. This is the type of  backWood of guitar
	   * @param topWood. This is the type of topWood of guitar.
	 */
	
	
	public void addGuitar(String serialNumber, double price, Guitar.builder guitar_builder, String model, Guitar.type guitar_type, Guitar.backWood backwood_type, Guitar.topWood topwood_type)  {		
		Guitar guitar = new Guitar(serialNumber, price, guitar_builder, model, guitar_type, backwood_type, topwood_type);		
		guitars.add(guitar);
	}
  	

	

	/**
	 * 
	 * Takes serialNumber and returns guitar matching the provided serialNumber
	 * @return guitar. Returns a guitar object
	 * @param serialNumber. Input to the method is serial number of guitar
	 */
	
	public Guitar getGuitar(String serialnumber) {
    
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {				
			Guitar guitar = (Guitar)i.next();
			if (guitar.getSerialNumber().equals(serialnumber)) {			
				return guitar;
			}		
    }		 
	return null;  
	}
  	
	
	/**
	 * 
	 * Checks for builder, model, type, backWood and topWood of the provided guitar.
	 * @return List<Guitar> . Returns list containing guitars
	 *  @param GuitarSpec . We are passing object of GuitarSpec.
	 */
	
	public List<Guitar> search(GuitarSpec searchSpec) {
    
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
 	    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
 	      GuitarSpec guitarSpec = guitar.getSpec();
 	      if (searchSpec.getBuilder() != guitarSpec.getBuilder())
 	        continue;
 	      String model = searchSpec.getModel().toLowerCase();
 	      if ((model != null) && (!model.equals("")) &&
 	          (!model.equals(guitarSpec.getModel().toLowerCase())))
 	        continue;
 	      if (searchSpec.getType() != guitarSpec.getType())
 	        continue;
 	      if (searchSpec.getBackWood() != guitarSpec.getBackWood())
 	        continue;
 	      if (searchSpec.getTopWood() != guitarSpec.getTopWood())
 	        continue;
 	      matchingGuitars.add(guitar);
 	    }
 	    return matchingGuitars;
	}	  
	 
	
	/**
	 * This method returns guitars that falls between given price p1 and p2
	 * @param p1. This is the minimum price of guitar.
	 * @param p2. This is the maximum price of guitar.
	 * @return List of Guitar objects
	 */
	public List<Guitar> getGuitarByPrice(double p1,double p2) {
		 	List<Guitar> matchByPrice = new ArrayList<Guitar>();
		 	for (Iterator<Guitar> i = matchByPrice.iterator(); i.hasNext(); ) {
		 	      Guitar guitar = (Guitar)i.next();
		 	      
		 	      if (guitar.getPrice()>=p1 && guitar.getPrice()<=p2 ) {
		 	    	 matchByPrice.add(guitar);
		 	      }
		 	    }
		 	return matchByPrice;
	}
	
	
}
		  

	
	
	
	

