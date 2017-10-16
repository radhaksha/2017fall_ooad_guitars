
/**
 
 Class: Object-Oriented Design and Analysis
 Professor: Orlando Montalvo
 Assignment:   HW 2 
 Student: Radha Kumari Sharma 
GitID: radhaksha
*/

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * This is a JUnit test class especially created to test all the methods present
 * in Inventory class We have Unit tested addGuitar, getGuitar and Search
 * methods.
 *
 * @param <Guitars>
 * @param <backWood>
 */

public class InventoryTest {

	/**
	 * Junit test for addGuitar Method
	 */
	@Test
	public void addGuitar() {
		assertAddGuitar();
	}

	/**
	 * Junit test for searchGuitar Method
	 */
	@Test
	public void searchGuitar() {
		assertSearchGuitar();
	}

	/**
	 * Junit test for getGuitar Method
	 */
	@Test
	public void getGuitar() {
		 assertGetGuitar();
	}

	/**
	 * private class method created to not repeat code multiple times.
	 */
	private void assertAddGuitar() {
		Inventory<Guitar> inventory = new Inventory<Guitar>();
		inventory.addGuitar("AT21345", 1499.95, Guitar.builder.Gibson, "Stratocastor", Guitar.type.electric,
				Guitar.backWood.IndianRosewood, Guitar.topWood.Alder);
		assertTrue(inventory.guitars.size() > 0);
	}
	
	

	/**
	 * private class method to test Search method
	 */
	private void assertSearchGuitar() {
		Inventory<Guitar> inventory = new Inventory<Guitar>();		
		inventory.addGuitar("AT21345", 1499.95, Guitar.builder.Fender, "Stratocastor", Guitar.type.acoustic,Guitar.backWood.Alder, Guitar.topWood.Alder);		
		GuitarSpec guitarspec = new GuitarSpec(Guitar.builder.Fender, "Stratocastor", Guitar.type.acoustic,Guitar.backWood.Alder, Guitar.topWood.Alder);	
		List<Guitar> myguitar = inventory.search(guitarspec);
		for (Iterator<Guitar> i = myguitar.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			GuitarSpec spec = guitar.getSpec();
			assertEquals(spec.getBuilder(), Guitar.builder.Fender);
			assertEquals(spec.getModel(), "Stratocastor");
			assertEquals(spec.getType(), Guitar.type.acoustic);
			assertEquals(spec.getBackWood(), Guitar.backWood.Alder);
			assertEquals(spec.getTopWood(), Guitar.topWood.Alder);
		}
		
	}	
		
	
	
	/**
	 * private class method to test getGuitar functionality
	 */
	private void assertGetGuitar() {
			Inventory<Guitar> inventory = new Inventory<Guitar>();		
			inventory.addGuitar("AT21345", 1499.95, Guitar.builder.Fender, "Stratocastor", Guitar.type.acoustic,Guitar.backWood.Alder, Guitar.topWood.Alder);		
			Guitar myGuitar = inventory.getGuitar("AT21345");
			assertEquals(myGuitar.getSerialNumber(),"AT21345");

	}
	
	
	
	
	
}
