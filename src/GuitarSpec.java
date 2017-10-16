

public class GuitarSpec {
	
	
	  private String model;
	  Guitar.backWood backwood_type;
	  Guitar.topWood topwood_type;
	  Guitar.type guitar_type;
	  Guitar.builder guitar_builder;
	
	  
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
	  
	  public GuitarSpec(Guitar.builder guitar_builder2, String model, Guitar.type guitar_type, Guitar.backWood backwood_type, Guitar.topWood topwood_type) {
	    this.guitar_builder = guitar_builder2;
	    this.model = model;
	    this.guitar_type = guitar_type;
	    this.backwood_type = backwood_type;
	    this.topwood_type = topwood_type;
	  }
	
	  
	  



	  public boolean matches(GuitarSpec otherspec) {
		  if (guitar_builder !=otherspec.guitar_builder) {
			  return false;
		  }
		  if ((model!=null) && (model != otherspec.model) && (!model.equals("")) ) {
			  return false;
		  }
		  if (guitar_type !=otherspec.guitar_type) {
			  return false;
		  }
		  if (backwood_type !=otherspec.backwood_type) {
			  return false;
		  }
		  if (topwood_type !=otherspec.topwood_type) {
			  return false;
		  }		  
		return true;
		  
	  }
	  
	  
	  /**
	   * 
	   * @return builder of the guitar
	   */	  
	  public Guitar.builder getBuilder() {
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
	  public Guitar.type getType() {
	    return guitar_type;
	  }
	  
	  
	  /**
	   * 
	   * @return BackWood of guitar
	   */
	  public Guitar.backWood getBackWood() {
	    return backwood_type;
	  }
	  
	  
	  /**
	   * 
	   * @return TopWood of guitar
	   */
	  public Guitar.topWood getTopWood() {
	    return topwood_type;
	  }

	  
	    
	  
	  
}
