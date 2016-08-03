package com.gfom.ts.triangle.validator;

import com.gfom.ts.triangle.Triangle;
import com.gfom.ts.triangle.TriangleType;

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
 * @see TriangleType
 * @author gilmatias
 *
 */
public class TriangleClassificator {

	/**
	 * main checker method
	 * 
	 * @return A TriangleType corresponding with the object
	 * @see TriangleType
	 * @see Triangle
	 * @throws IllegalArgumentException
	 *             If the object does not qualify as an triangle, although it is
	 *             an uncheck exception it is made explicit to aid clients
	 */
	public static TriangleType classifyTriangle(Triangle triangle) throws IllegalArgumentException {
		if (!checkTriangle(triangle)) {
			throw new IllegalArgumentException("The object does not classify as a triangle");
		}

		// first check if it is equilateral as it is faster
		if (isEquilateral(triangle)) {
			return TriangleType.equilateral;
		}
		if (isIsoceles(triangle)) {
			return TriangleType.isosceles;
		}
		// if it is a Triangle and if it is nothing else then it must be
		// scalene;
		return TriangleType.scalene;

	}

	private static boolean checkTriangleSides(long sideA, long sideB, long sideC) {
		if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
			return false;
		}
		return true;
	}

	private static boolean checkTriangle(Triangle t) {
		return checkTriangleSides(t.getSideA(), t.getSideB(), t.getSideC());
	}

	private static boolean isIsoceles(Triangle triangle) {
		boolean aEqualsB = triangle.getSideA() == triangle.getSideB();
		boolean aEqualsC = triangle.getSideA() == triangle.getSideC();
		boolean bEqualsC = triangle.getSideB() == triangle.getSideC();

		/*
		 * ATTENTION: use of XOR, one must be true and the others must be false.
		 */
		return aEqualsB ^ aEqualsC ^ bEqualsC;
	}

	private static boolean isEquilateral(Triangle triangle) {
		// if A = B = C then true
		return (triangle.getSideA() == triangle.getSideB()) && (triangle.getSideB() == triangle.getSideC());
	}
}
