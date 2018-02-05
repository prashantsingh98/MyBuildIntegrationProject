/**
 * Multiplication Test
 */
package com.prashant.test;
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
	public void testMultiply() {
		System.out.println("Into MultiplicationTest.testMultiply");
		Assert.assertEquals(8, (new Multiplication()).multiply(4, 2));
	}

}