package io.junitbasics.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	MathUtils m;
	
	@BeforeAll
	 void beforeAllInit()
	{
		System.out.println("This needs to run before all");
	}
	
	@BeforeEach
	void init()
	{
		m= new MathUtils();
	}
	
	@AfterEach
	void cleanup()
	{
		System.out.println("Cleaning up.....");
	}

	@Nested
	class AddTest
	{
	@Test
	@DisplayName("Testing Add Method for positive")
	void testAddPositive() {
         int expected=2;
         int actual=m.add(1, 1);
         assertEquals(expected, actual);
	}
	@Test
	@DisplayName("Testing Add Method for negative")
	void testAddNegative() {
         int expected=-2;
         int actual=m.add(-1, -1);
         assertEquals(expected, actual);
	}
	}
	@Test
	@Disabled
	@DisplayName("TDD Disabled : This should not run")
	void testDisabled()
	{
		fail("This test should be disbaled");
	}
	
	
	@RepeatedTest(3)
	void testComputeCircleArea()
	{
	     assertEquals(314.1592653589793238, m.computeCircleArea(10),"Computed The area of circle ");
	}
	
	@Test
	void testDivide()
	{
		assertThrows(ArithmeticException.class, ()->m.divide(1, 0), "Divide by zero throws exception");
	}
	
	@Test
	void testMultiply()
	{
		assertAll(
				()->assertEquals(4, m.multiply(2, 2)),
				()->assertEquals(0, m.multiply(2, 0)),
				()->assertEquals(-2, m.multiply(2, -1))
				);
	}

}
