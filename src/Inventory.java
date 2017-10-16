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
	 * @param serialNumber
	 * @param price
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	
	public void addGuitar(String serialNumber, double price, Guitar.builder guitar_builder, String model, Guitar.type guitar_type, Guitar.backWood backwood_type, Guitar.topWood topwood_type)  {		
		Guitar guitar = new Guitar(serialNumber, price, guitar_builder, model, guitar_type, backwood_type, topwood_type);		
		guitars.add(guitar);
	}
  	

	

	/**
	 * 
	 * @param serialNumber. Takes serialNumber and returns guitar matching the provided serialNumber
	 * @return guitar
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
	 * @param searchGuitar. Checks for builder, model, type, backWood and topWood of the provided guitar.
	 * @return guitar
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
	 * @param p1
	 * @param p2
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
		  

	
	
	
	

