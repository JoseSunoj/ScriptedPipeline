/**
 * 
 */
package ie.lyit.devops.ScriptedPipeline;

/**
 * A Java program for basic triangle functions, such as determine the given
 * edges forms a triangle, find area etc.
 * 
 * @author sunoj
 * 
 */
public class Triangle {
	/**
	 * A method to test whether the three given edges forms a triangle
	 * 
	 * @param a length of edge-1
	 * @param b length of edge-2
	 * @param c length of edge-3
	 * @return true or false
	 */
	public boolean isTriangle(double a, double b, double c) {
		return (a + b > c) && (b + c > a) && (a + c > b);
	}

	/**
	 * A method to test whether given three edges forms a right angled triangle
	 * 
	 * @param a length of edge-1
	 * @param b length of edge-2
	 * @param c length of edge-3
	 * @return true or false
	 */
	public boolean isRightTriangle(double a, double b, double c) {
		if (isTriangle(a, b, c)) {
			return Math.pow(Math.max(a, Math.max(b, c)), 2) == Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)
					- Math.pow(Math.max(a, Math.max(b, c)), 2);
		}
		return false;
	}
}
