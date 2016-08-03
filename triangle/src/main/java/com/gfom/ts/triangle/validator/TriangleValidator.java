package com.gfom.ts.triangle.validator;

import com.gfom.ts.triangle.Triangle;

/**
 * Important considerations: <br/>
 * No negative size edges allowed <br/>
 * No zero size edges allowed, as this would transform the object in a point or
 * a line <br/>
 * <br/>
 * Principles of equivalence should be taken in account. <br/>
 * For example if Triangle(A,B,C) is a valid triangle then Triangle(C,B,A) must
 * be a valid triangle as well
 * 
 * @see Triangle
 * @author gilmatias
 *
 */
public class TriangleValidator {

	/**
	 * basic checker
	 * 
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 * @return
	 */
	public static boolean checkTriangleSides(long sideA, long sideB, long sideC) {
		return false;
	}

	/**
	 * basic checker for triangle Objects
	 * 
	 * @see Triangle
	 * @param t
	 * @return
	 */
	public static boolean checkTriangle(Triangle t) {
		return checkTriangleSides(t.getSideA(), t.getSideB(), t.getSideC());
	}
}
