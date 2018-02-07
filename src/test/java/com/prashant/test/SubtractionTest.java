
package com.prashant.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

import com.prashant.Subtraction;;

/**
 * @author prashant.singh
 *
 */
public class SubtractionTest {

	public SubtractionTest() {
		// default constructor
	}

	
	@Test
	public void testSubtract() throws InterruptedException {
		System.out.println("Into SubtractionTest.testSubtract");
		TimeUnit.MINUTES.sleep(2);
		Assert.assertEquals(3, (new Subtraction()).subtract(5, 2));
	}
}