import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory<Guitars> {
 

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
	
	public void addGuitar(String serialNumber, double price, String builder, String model,String type, String backWood, String topWood){                                                
		Guitar guitar = new Guitar(serialNumber, price, builder,model, type, backWood, topWood);		
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
	
	public Guitar search(Guitar searchGuitar) {
   
	  for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
		  
		  Guitar guitar = (Guitar)i.next();
	      
	      String builder = searchGuitar.getBuilder();     
	      if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
	        continue;
	      
	      String model = searchGuitar.getModel();      
	      if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
	        continue;
	      
	      String type = searchGuitar.getType();
	      if ((type != null) && (!searchGuitar.equals("")) && (!type.equals(guitar.getType())))
	        continue;
	      
	      String backWood = searchGuitar.getBackWood();
	      if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
	        continue;
	      
	      String topWood = searchGuitar.getTopWood();
	      if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))
	        continue;
	      
	      return guitar;
    }		
    return null;
  }	
}
