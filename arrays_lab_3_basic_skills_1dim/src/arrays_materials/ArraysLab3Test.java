package arrays_materials;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ArraysLab3Test
{
	
	@Test
	public void testSum() 
	{
		int[] a1 = 				{5, 10, 15, 20, 25, 30, 35, 40, 0, 0,  -10};
		int[] a2 = 				{7, 14, 21, 28, 35, 42, 49, 56, 0, 15, -15};
		int[] expectedResult = 	{12, 24, 36, 48, 60, 72, 84, 96, 0, 15, -25};
		int[] result = ArraysLab3.sum(a1, a2);
		Assert.assertArrayEquals("Result " + Arrays.toString(result) 
		                         + " Does not match the expected value of " + Arrays.toString(expectedResult),
		                         expectedResult, result);
		System.out.println("Unit test testSum passed.");
	}


	@Test

//	@Test
	public void testSumEven() 
	{
		int[] a1 = 				{0, 5, 10, 15, 20, 25, 30, 35, 40};
		int expectedResult = 	100;
		int result = ArraysLab3.sumEven(a1);
		assertEquals("Result " + result
		             + " Does not match the expected value of " + expectedResult,
		              expectedResult, result);
		System.out.println("Unit test testSumEven passed.");
	}


	@Test
	public void testRotateRight() 
	{
		int[] a1 = 				{0, 5, 10, 15, 20, 25, 30, 35, 40};
		int[] expectedResult = 	{40, 0, 5, 10, 15, 20, 25, 30, 35};
		ArraysLab3.rotateRight(a1);
		Assert.assertArrayEquals("Result " + a1
		                          + " Does not match the expected value of " + expectedResult,
		                          expectedResult, a1);
		System.out.println("Unit test testRotateRight passed.");
	}

}
