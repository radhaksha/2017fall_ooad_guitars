/**

Class: Object-Oriented Design and Analysis
Professor: Orlando Montalvo
Assignment: HW 2 (Question 1 and 2)
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
 * search    Mehod  - searches if specific guitar is present in list. @Returns ArrayList
 */


public class Inventory<Guitars, backWood> {
 

	/**
	 * guitars declared as List
	 */
	
	private List<Guitar> guitars;

  
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
	
	public void addGuitar(String serialNumber, double price, Guitar.builder guitar_builder, String model, Guitar.type guitar_type, Guitar.backWood backwood_type, Guitar.topWood topwood_type){                                                
		Guitar guitar = new Guitar(serialNumber, price, guitar_builder, model, guitar_type, backwood_type, topwood_type);		
		guitars.add(guitar);
	}
  	
	
	/**
	 * 
	 * @param serialNumber. Takes serialNumber and returns guitar matching the provided serialNumber
	 * @return guitar
	 */
	public Guitar getGuitar(String serialNumber) {
    
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {				
			Guitar guitar = (Guitar)i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {			
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
	
	public List<Guitar> search(Guitar searchGuitar) {
    
	  List<Guitar> myguitars = new ArrayList<Guitar>();
		
	  for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
		  
		  Guitar guitar = (Guitar)i.next();
	      
		  
	      Guitar.builder guitar_builder = searchGuitar.getBuilder();     
	      if ((guitar_builder != null) && (!guitar_builder.equals("")) && (!guitar_builder.equals(guitar.getBuilder())))
	        continue;
	      
	      String model = searchGuitar.getModel();      
	      if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
	        continue;
	      
	      Guitar.type guitar_type = searchGuitar.getType();
	      if ((guitar_type != null) && (!guitar_type.equals("")) && (!guitar_type.equals(guitar.getType())))
	        continue;
	      
	      
	      Guitar.backWood backWood = searchGuitar.getBackWood();
	      if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
	        continue;
	      
	      
	      /**
	       * Below code helps to search guitar with price
	       */
	      Double price = searchGuitar.getPrice();     
	      if ((price != null) && (!price.equals(guitar.getPrice())))
	        continue;
	      
	      
	      Guitar.topWood topWood = searchGuitar.getTopWood();
	      if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))
	        continue;
	     
	      
	      myguitars.add(guitar);
	  }   
	  
    return myguitars;
  }
	
	
	
	
}
