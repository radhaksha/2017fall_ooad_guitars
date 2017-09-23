
/**
 * This class implements the properties and behaviour of Guitar.
 *
 * @author raghuram
 */
public class Guitar {

    private String serialNumber, builder, model, type, backWood, topWood;
    private double price;

    /**
     * Constructor for the class Guitar with the following arguments
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
     * Function returns the serial number of guitar
     *
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Function returns the price of guitar
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Function sets the new price
     *
     * @param newPrice set the new price
     */
    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    /**
     * The function returns builder information of guitar
     *
     * @return builder
     */
    public String getBuilder() {
        return builder;
    }

    /**
     * The function returns model of guitar
     *
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * The function returns type of guitar
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * The function returns Backwood
     *
     * @return Backwood
     */
    public String getBackWood() {
        return backWood;
    }

    /**
     * The function returns the topwood
     *
     * @return topWood
     */
    public String getTopWood() {
        return topWood;
    }
}
