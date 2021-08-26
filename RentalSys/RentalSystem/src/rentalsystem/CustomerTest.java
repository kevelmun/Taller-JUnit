package rentalsystem;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest extends junit.framework.TestCase{
	static Customer customer;
	@BeforeClass
	public void setUp(){
		customer = new Customer("Customer1");
	}

	@Test
	public void testCustomer() {
		Customer customerTest=new Customer("CustomerTest");
		
		String nameUsed = "Customer1";
		String nameSpected = "Customer1";
		customerTest = new Customer(nameUsed);
		assertTrue(nameSpected.equals(customerTest._name ));
		
	}
	
	@Test
	public void testAddMovieRental() {
		int initialSize = customer.get_movieRentals().size();
		customer.addMovieRental(new MovieRental(new Movie("Titanic", 20), 7));
		
		assertEquals(initialSize+1, customer.get_movieRentals().size());
	}

	@Test
	public void testAddVideoGameRental() {
		int initialSize = customer.get_movieRentals().size();
		customer.addVideoGameRental(new VideoGameRental("Gta V", 10, false));
		
		assertEquals(initialSize+1, customer.get_videoGameRental().size());
	}

	@Test
	public void testStatement() {
		
		assertNotNull(customer.statement());
		
	}

}
