/**

Class: Object-Oriented Design and Analysis
Professor: Orlando Montalvo
Assignment: HW 2 (Question 1 and 2)
Student: Radha Kumari Sharma 
GitID: radhaksha

*/
public class Guitar {

	  private String serialNumber, model;
	  backWood backwood_type;
	  topWood topwood_type;
	  type guitar_type;
	  builder guitar_builder;
	  private double price;
	
	  
	  
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
	  
	  
	  
	  public enum type {
		  electric,
		  acoustic
	  }
	  
	  
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
	   * @param serialNumber
	   * @param price
	   * @param builder
	   * @param model
	   * @param type
	   * @param backWood
	   * @param topWood
	   */
	  
	  public Guitar(String serialNumber, double price, builder guitar_builder, String model, type guitar_type, backWood backwood_type, topWood topwood_type) {
	    this.serialNumber = serialNumber;
	    this.price = price;
	    this.guitar_builder = guitar_builder;
	    this.model = model;
	    this.guitar_type = guitar_type;
	    this.backwood_type = backwood_type;
	    this.topwood_type = topwood_type;
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
	   * @param newPrice to set. Setting price for guitar.
	   */
	  public void setPrice(float newPrice) {
	    this.price = newPrice;
	  }
	  
	  
	  /**
	   * 
	   * @return builder of the guitar
	   */	  
	  public builder getBuilder() {
	    return guitar_builder;
	  }
	  
	  
	  /**
	   * 
	   * @return model
	   */
	  public String getModel() {
	    return model;
	  }
	  
	  
	  /**
	   * @return type of guitar
	   */
	  public type getType() {
	    return guitar_type;
	  }
	  
	  
	  /**
	   * 
	   * @return BackWood of guitar
	   */
	  public backWood getBackWood() {
	    return backwood_type;
	  }
	  
	  
	  /**
	   * 
	   * @return TopWood of guitar
	   */
	  public topWood getTopWood() {
	    return topwood_type;
	  }


}
