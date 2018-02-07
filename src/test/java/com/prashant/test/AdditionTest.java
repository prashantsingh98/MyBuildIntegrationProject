/**
 * Test Addition
 */
package com.prashant.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

import com.prashant.Addition;

/**
 * @author prashant.singh
 *
 */
public class AdditionTest {

	public AdditionTest() {
		// default constructor
	}

	
	@Test
	public void testAdd() throws InterruptedException {
		System.out.println("Into AdditionTest.testAdd");
		TimeUnit.MINUTES.sleep(2);
		Assert.assertEquals(4, (new Addition()).add(2, 2));
	}
}