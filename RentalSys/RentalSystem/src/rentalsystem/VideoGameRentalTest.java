/**
 * 
 */
package rentalsystem;
import static org.junit.Assert.fail;

import org.junit.*;

/**
 * @author USER
 *
 */
public class VideoGameRentalTest extends junit.framework.TestCase {
	VideoGameRental vgr1, vgr2, vgr3;
	int daysRented;
	WiiGame w1; 
	
	@Before
	public void setUp() throws Exception {
		w1 = new WiiGame("Minecraft");
		daysRented = 13;
		vgr1 = new VideoGameRental(w1,13,true);
		vgr2 = new VideoGameRental(new Ps3Game("Genshin Impact"),13,false);
		vgr3 = new VideoGameRental(new Xbox360Game("Fortnite"),13,false);
	}

	@Test
	public void testGetCharge() {
		assertTrue(vgr1.getCharge()>0);
	}
	
	@Test
	public void testGetCharge2() {
		assertTrue(vgr2.getCharge()>0);
	}
	
	@Test
	public void testGetCharge3() {
		assertTrue(vgr3.getCharge()>0);
	}
	
	@Test
	public void testGetDaysRented() {
		assertEquals(vgr1.getDaysRented(), daysRented);
	}

	@Test
	public void testGetVideoGame() {
		assertSame(vgr1.getVideoGame(), w1);
	}

	@Test
	public void testGetFrequentRenterPoints() {
		assertTrue(vgr1.getFrequentRenterPoints()>0);
	}
}
