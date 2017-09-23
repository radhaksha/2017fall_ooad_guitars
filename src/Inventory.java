
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This class implements properties and behavior of inventory
 *
 * @author raghuram
 */
public class Inventory {

    private List<Guitar> guitars;

    /**
     * This is the Constructor for the class Inventory and initialise guitars linkedlist
     */
    public Inventory() {
        guitars = new LinkedList();
    }

    /**
     * The function adds up new guitar into guitars list
     *
     * @param serialNumber
     * @param price
     * @param builder
     * @param model
     * @param type
     * @param backWood
     * @param topWood
     */
    public void addGuitar(String serialNumber, double price,
            String builder, String model,
            String type, String backWood, String topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder,
                model, type, backWood, topWood);
        guitars.add(guitar);
    }

    /**
     * The function gets the serialNumber and compare with guitar list serial
     * number if there is any match returns guitar object else returns null
     *
     * @param serialNumber
     * @return guitar object
     */
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    /**
     * The function gets searchGuitar object
     *
     * @param searchGuitar
     * @return guitar object or null
     */
    public Guitar search(Guitar searchGuitar) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals(""))
                    && (!builder.equals(guitar.getBuilder()))) {
                continue;
            }
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals(""))
                    && (!model.equals(guitar.getModel()))) {
                continue;
            }
            String type = searchGuitar.getType();
            if ((type != null) && (!searchGuitar.equals(""))
                    && (!type.equals(guitar.getType()))) {
                continue;
            }
            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals(""))
                    && (!backWood.equals(guitar.getBackWood()))) {
                continue;
            }
            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals(""))
                    && (!topWood.equals(guitar.getTopWood()))) {
                continue;
            }
            return guitar;
        }
        return null;
    }
}
