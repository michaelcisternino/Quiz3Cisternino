package triangleTest;
/**
 * TriangleTest uses JUnit to test methods getArea and getPerimeter from Triangle class
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Triangle;

public class TriangleTest {

	private static Triangle triangle;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		triangle = new Triangle(24.0, 30.0, 18.0);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testArea() {
		double expArea = 216.0;
		assertTrue(triangle.getArea() == expArea);
	}
	
	@Test
	public void testPerimeter() {
		double expPerim = 72.0;
		assertTrue(triangle.getPerimeter() == expPerim);
		
	}

}
