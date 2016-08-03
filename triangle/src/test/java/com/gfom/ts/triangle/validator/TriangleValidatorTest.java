package com.gfom.ts.triangle.validator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gfom.ts.triangle.Triangle;
import com.gfom.ts.triangle.TriangleType;

public class TriangleValidatorTest {

	@Test
	public void testEquilateral() {
		Triangle t = new Triangle(3, 3, 3);

		assertEquals(TriangleType.equilateral, TriangleValidator.classifyTriangle(t));
	}

	@Test
	public void testIsoceles() {
		Triangle t = new Triangle(3, 3, 1);
		assertEquals(TriangleType.isosceles, TriangleValidator.classifyTriangle(t));
	}

	@Test
	public void testScalene() {
		Triangle t1 = new Triangle(3, 2, 1);
		assertEquals(TriangleType.scalene, TriangleValidator.classifyTriangle(t1));

		Triangle t2 = new Triangle(1, 3, 2);
		assertEquals(TriangleType.scalene, TriangleValidator.classifyTriangle(t2));

		Triangle t3 = new Triangle(2, 1, 3);
		assertEquals(TriangleType.scalene, TriangleValidator.classifyTriangle(t3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testZeroSizeTriangle() {
		Triangle t = new Triangle(0, 2, 1);
		TriangleValidator.classifyTriangle(t);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeSizeTriangle() {
		Triangle t = new Triangle(-1, 2, 1);
		TriangleValidator.classifyTriangle(t);
	}

	@Test
	public void testSimetricTriangles() {
		Triangle t1 = new Triangle(1, 2, 2);
		Triangle t2 = new Triangle(2, 2, 1);
		TriangleType type1 = TriangleValidator.classifyTriangle(t1);
		TriangleType type2 = TriangleValidator.classifyTriangle(t2);
		assertEquals(type1, type2);
	}

	@Test
	public void testGiganticTriangle() {
		Triangle t = new Triangle(Long.MAX_VALUE, 2, 2);
		assertEquals(TriangleType.isosceles, TriangleValidator.classifyTriangle(t));
	}
}
