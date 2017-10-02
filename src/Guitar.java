public class Guitar {
	private String serialNumber, builder, model, type, backWood, topWood;
	private double price;

	/**
	 * This is a parameterized constructor.
	 * 
	 * @param serialNumber
	 * @param price
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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
	 * @param newPrice
	 *            to set. Setting price for guitar.
	 */
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	/**
	 * 
	 * @return builder of the guitar
	 */
	public String getBuilder() {
		return builder;
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
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @return BackWood of guitar
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * 
	 * @return TopWood of guitar
	 */
	public String getTopWood() {
		return topWood;
	}

}