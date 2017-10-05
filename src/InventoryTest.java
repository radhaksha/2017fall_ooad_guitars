/**

Class: Object-Oriented Design and Analysis
Professor: Orlando Montalvo
Assignment: HW 2 (Question 1 and 2)
Student: Radha Kumari Sharma 
GitID: radhaksha

*/

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * 
 * This is a JUnit test class especially created to test all the methods present in Inventory class
 * We have Unit tested addGuitar, getGuitar and Search methods.
 *
 * @param <Guitars>
 * @param <backWood>
 */

public class InventoryTest<Guitars, backWood> {

		/**
		 * Junit test for addGuitar Method
		 */
		@Test
		public void addGuitar() {
			assertMyGuitar();
		}

		/**
		 * Junit test for searchGuitar Method
		 */
		@Test
		public void searchGuitar() {
			assertMyGuitar();
		}

		/**
		 * Junit test for getGuitar Method
		 */
		@Test
		public void getGuitar() {
			assertMyGuitar();
		}
		
		
		/**
		 * private class method created to not repeat code multiple times.
		 */
		private void assertMyGuitar() {
			Inventory inventory = new Inventory();
			List<Guitar> guitars = null;
			guitars = new LinkedList<Guitar>();
			Guitar actualGuitar = new Guitar("AT21345", 1499.95, Guitar.builder.Fender, "Stratocastor", Guitar.type.acoustic, Guitar.backWood.Alder, Guitar.topWood.Alder);
			inventory.addGuitar("AT21345", 1499.95, Guitar.builder.Fender, "Stratocastor", Guitar.type.acoustic, Guitar.backWood.Alder, Guitar.topWood.Alder);
			guitars = inventory.search(actualGuitar);
			if (guitars.size()>0) {  
				assertEquals(guitars.get(0), actualGuitar);				
			}			
			Guitar expectedGuitar = inventory.getGuitar("AT21345");
			assertEquals(expectedGuitar, actualGuitar);
		}
	
	

}