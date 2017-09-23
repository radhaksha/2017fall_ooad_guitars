/**
 * 
 * @author Uday Reddy Malgireddy
 * 
 */
public class Guitar  {
	
  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;

  /**
   * 
   * @param serialNumber
   * @param price
   * @param builder
   * @param model
   * @param type
   * @param backWood
   * @param topWood
   */
   
    public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }
    
    /**
     * @return
     */

  public String getSerialNumber() {
    return serialNumber;
  }
  
  /**
   * @return
   */

    public double getPrice() {
    return price;
  }
    /**
     * 
     * @param newPrice
     */
    public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  /**
   * 
   * @return
   */
    public String getBuilder() {
    return builder;
  }
    /**
     * 
     * @return
     */
    public String getModel() {
    return model;
  }
    /**
     * 
     * @return
     */
    public String getType() {
    return type;
  }
    /**
     * 
     * @return
     */
    public String getBackWood() {
    return backWood;
  }
    /**
     * 
     * @return
     */
  public String getTopWood() {
    return topWood;
  }
}
