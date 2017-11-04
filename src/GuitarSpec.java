/**
 * 
 *Class: Object-Oriented Design and Analysis
 *
 */
 
 /**
  * 
  * This guitarspec class creates guitar objects with all the attributes of Guitar except serial number and price.
  *  THis helps to find guitars with matching attributes.   
  *
  */


    public class GuitarSpec {
	
	
	  private String model;
	  Guitar.backWood backwood_type;
	  Guitar.topWood topwood_type;
	  Guitar.type guitar_type;
	  Guitar.builder guitar_builder;
	
	  
	  /**
	   * This is a parameterized constructor.
	  
	   * @param builder. this is the builder of guitar
	   * @param model. This is the model name of the guitar.
	   * @param type. This is the type of guitar.
	   * @param backWood. This is the type of  backWood of guitar
	   * @param topWood. This is the type of topWood of guitar.
	   */
	  
	  public GuitarSpec(Guitar.builder guitar_builder2, String model, Guitar.type guitar_type, Guitar.backWood backwood_type, Guitar.topWood topwood_type) {
	    this.guitar_builder = guitar_builder2;
	    this.model = model;
	    this.guitar_type = guitar_type;
	    this.backwood_type = backwood_type;
	    this.topwood_type = topwood_type;
	  }
	
	  
	  


      /**
       * This method tries to match guitarspec object of GuitarSpec class against list or other provided guitars.
       * @return boolean value. It returns true or false value.
       * @param otherspec. Object of GuitarSpec class
       */
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
