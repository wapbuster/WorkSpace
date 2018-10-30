package com.indus.training.area;
/**
 * 
 * @author sunnyhith
 *
 */
public interface IArea {
	/**
	 * 
	 * @param side
	 * @return
	 */
	public double square(double side);
	/**
	 * 
	 * @param length
	 * @param breadth
	 * @return
	 */
	public double rectangle(double length, double breadth);
	/**
	 * 
	 * @param radius
	 * @return
	 */
	public double circle(double radius);

}
