package rentalsystem;
import org.junit.*;

public class MovieTest extends junit.framework.TestCase {

    public MovieTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie sample = new Movie("Over the moon", Movie.CHILDRENS);
        int expected = Movie.CHILDRENS;
        int actual = sample.getPriceCode();
        assertEquals(expected, actual);
    }


    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int arg = Movie.NEW_RELEASE;
        Movie sample = new Movie("Lo que sea", Movie.REGULAR);
        sample.setPriceCode(arg);
        assertEquals(arg, sample.getPriceCode());
    }

    @Test
    public void testCambiarPrecios() {
        System.out.println("getPriceCode");
        Movie sample = new Movie("Over the moon", Movie.CHILDRENS);
        int expected = Movie.CHILDRENS;
        int actual = sample.getPriceCode();
        assertEquals(expected, actual);

        int arg = Movie.NEW_RELEASE;
        sample.setPriceCode(arg);
        assertEquals(arg, sample.getPriceCode());

    }

}