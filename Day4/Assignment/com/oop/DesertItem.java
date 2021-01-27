package com.oop;

/**
 * 
 * @author thinkitive
 *
 */
public abstract class DesertItem {
	/**
	 * It is String type Name Field
	 */
	public String name;

	/**
	 * This Method Returns Cost of Current Desert
	 * @return cost
	 */
	public abstract double returnCost();

	/**
	 * This is Final Method which returns Name of Desert
	 * @return name
	 */
	public final String returnName() {
		return this.name;
	}

}
