package rentalsystem;
import org.junit.*;

public class MovieRentalTest extends junit.framework.TestCase {

    Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;
    @Before
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);
    }

    @Test
    public void testGetPriceCode() {
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }

    @Test
    public void testGetTitle() {
        assertEquals("The Man Who Knew Too Much", theManWhoKnewTooMuch._title);
    }

    @Test
    public void testSetPriceCode() {
        theManWhoKnewTooMuch.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(Movie.NEW_RELEASE, theManWhoKnewTooMuch.getPriceCode());
        theManWhoKnewTooMuch.setPriceCode(Movie.REGULAR);
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }

    @Test
    public void testGetDaysRented() {
        assertEquals(2, new MovieRental(theManWhoKnewTooMuch, 2).getDaysRented());
    }

    @Test
    public void testGetMovie() {
        assertEquals(theManWhoKnewTooMuch, new MovieRental(theManWhoKnewTooMuch, 2).getMovie());
    }

    @Test
    public void testGetName() {
        String name = "John Cena"; 
        assertEquals(name, new Customer(name)._name);
    }

    @Test
    public void testStatementRegularMovieOnly() {
        Customer regularCustomer = new Customer("John Cena");
    }

    @Test
    public void testStatementChildrensMovieOnly() {
        Customer childCustomer = new Customer("John Cena Lite");
    }

    @Test
    public void testStatementNewReleaseOnly() {
        Customer nrCustomer = new Customer("Dr. of Thuganomics");
    }
}