/**

Class: Object-Oriented Design and Analysis
Professor: Orlando Montalvo
Assignment: HW 2
Student: Radha Kumari Sharma 
GitID: radhaksha

*/



/**
 * This class helps to create Guitar objects with various attributes.
 * Various Getters and Setters methods have also been defined.
 */

public class Guitar {
	  private String serialNumber;
	  private double price;
	  GuitarSpec spec;
	
	  
	
	  /**
	   * 
	   * enum declaration for type backWood.
	   * backWood can use various values which are as provided in below enum declaration. 
	   *
	   */
	  public enum backWood {
		  IndianRosewood,
		  BrazilianRosewood,
		  Mahogany,
		  Maple,
		  Cocobolo,
		  Cedar,
		  Adirondack,
		  Alder,
		  Sitka
	  }
	  
	  
	  /**
	   * 
	   * enum declaration for type topWood.
	   * topWood can use various values which are as provided in below enum declaration. 
	   */
	  public enum topWood {
		  IndianRosewood,
		  BrazilianRosewood,
		  Mahogany,
		  Maple,
		  Cocobolo,
		  Cedar,
		  Adirondack,
		  Alder,
		  Sitka
	  }
	  
	  
	  /**
	   * enum declaration for type type.
	   * type can use two values electric and acoustic. 
	   */	 
	  
	  public enum type {
		  electric,
		  acoustic
	  }
	  
	  
	  
	  /**
	   * enum declaration for Guitar builder.
	   * builder can use values as provided below. 
	   */
	  public enum builder{
		  Fender,
		  Martin,
		  Gibson,
		  Collings,
		  Olson,
		  Ryan,
		  PRS
	  }
	  
	  /**
	   * This is a parameterized constructor.
	   * @param serialNumber,this is the serial Number of  guitar.
	   * @param price. this is the price of guitar.
	   * @param builder. this is the builder of guitar
	   * @param model. This is the model name of the guitar.
	   * @param type. This is the type of guitar.
	   * @param backWood. This is the type of  backWood of guitar
	   * @param topWood. This is the type of topWood of guitar.
	   */
	  
	  public Guitar(String serialNumber, double price, builder guitar_builder, String model, type guitar_type, backWood backwood_type, topWood topwood_type) {
	    this.serialNumber = serialNumber;
	    this.price = price;
	    this.spec = new GuitarSpec(guitar_builder, model, guitar_type, backwood_type, topwood_type);
	  }
	
	  
	  /**
	   * 
	   * @return Serial Number of a guitar object
	   */
	  public String getSerialNumber() {
	    return serialNumber;
	  }
	
	  
	  /**
	   * 
	   * @return Price of the guitar in double
	   */
	  public double getPrice() {
	    return price;
	  }
	  
	  
	  /**
	   * 
	   * @return return guitarSpec
	   */
	  public GuitarSpec getSpec() {
		  	return spec;
	  }

}
