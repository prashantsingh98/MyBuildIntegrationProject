/**
 * Test Addition
 */
package com.prashant.test;

import org.junit.Assert;
import org.junit.Test;

import com.prashant.Addition;

/**
 * @author tarun.murala
 *
 */
public class AdditionTest {

	public AdditionTest() {
		// default constructor
	}

	
	@Test
	public void testAdd() {
		System.out.println("Into AdditionTest.testAdd");
		Assert.assertEquals(4, (new Addition()).add(2, 2));
	}
}