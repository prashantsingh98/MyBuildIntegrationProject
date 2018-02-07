/**
 * Multiplication Test
 */
package com.prashant.test;
import java.util.concurrent.TimeUnit;

import com.prashant.Multiplication;

import org.junit.Assert;
import org.junit.Test;



/**
 * @author prashant.singh
 *
 */
public class MultiplicationTest {

	public MultiplicationTest() {
		// default constructor
	}
	
	@Test
	public void testMultiply() throws InterruptedException {
		System.out.println("Into MultiplicationTest.testMultiply");
		TimeUnit.MINUTES.sleep(2);
		Assert.assertEquals(8, (new Multiplication()).multiply(4, 2));
	}

}