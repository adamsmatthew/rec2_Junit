package examples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InterpolatorTest {
	double doublePrecision;
	
	@Before
	public void setUp() {
		doublePrecision = 0.0001;
	}

	
	@Test
	public void testLinearInterpolate() {
		double[] p1 = {-1,-1};
		double[] p2 = {3,3};
		
		double y = Interpolator.linearInterpolate(p1, p2, 1.4);
		assertEquals(1.4, y, doublePrecision);
	}

	
	@Test
	public void testGetMidpoint() {
		double[] p1 = {-1,-1};
		double[] p2 = {3,3};
		
		double[] midptActual = Interpolator.getMidpoint(p1, p2);
		double[] midptExpected = {1.0,1.0};
		assertArrayEquals(midptExpected, midptActual, doublePrecision);
	}

}
