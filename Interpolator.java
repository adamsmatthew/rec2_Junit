package examples;

public class Interpolator {

	/**
	 * Returns the y-value of a point interpolated between two points.
	 * 
	 * @param point1 a point [x,y]
	 * @param point2 another point [x,y]
	 * @param x the x-value of the interpolated point
	 * @return the y-value of the interpolated point
	 */
	public static double linearInterpolate(double[] point1, double[] point2, double x) {
		double x1 = point1[0];
		double y1 = point1[1];
		double x2 = point2[0];
		double y2 = point2[1];
		
		double y = y1 + (y2-y1)*(x-x1)/(x2-x1);
		return y;
	}
	
	
	/**
	 * Returns the midpoint between the two points
	 * 
	 * @param point1 a point [x,y]
	 * @param point2 another point [x,y]
	 * @return the midpoint [x,y]
	 */
	public static double[] getMidpoint(double[] point1, double[] point2) {
		double x1 = point1[0];
		double y1 = point1[1];
		double x2 = point2[0];
		double y2 = point2[1];
		
		double x = (x1+x2)/2;
		double y = (y1+y2)/2;
		double[] midpoint = {x,y};
		
		return midpoint;
	}
}
