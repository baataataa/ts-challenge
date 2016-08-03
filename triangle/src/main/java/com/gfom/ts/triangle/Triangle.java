package com.gfom.ts.triangle;

/**
 * Object to represent said Triangle Triangles are non-mutable objects
 * 
 * For the sake of simplicity, only the area/perimeter are considered <br/>
 * <br/>
 * Positional references where left out for the sake of simplicity. <br/>
 * Orientation and position should be handled by clients of this class
 * 
 * @author gilmatias
 *
 */
public class Triangle {
	long sideA;
	long sideB;
	long sideC;

	/**
	 * Basic constructor, the only way to specify a triangle
	 * 
	 * @param sideA
	 *            side A
	 * @param sideB
	 *            side B
	 * @param sideC
	 *            side C
	 */
	public Triangle(long sideA, long sideB, long sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	/**
	 * Getter for side A
	 * 
	 * @return side A
	 */
	public long getSideA() {
		return sideA;
	}

	/**
	 * Getter for side B
	 * 
	 * @return side B
	 */
	public long getSideB() {
		return sideB;
	}

	/**
	 * Getter for side C
	 * 
	 * @return side C
	 */
	public long getSideC() {
		return sideC;
	}
}
