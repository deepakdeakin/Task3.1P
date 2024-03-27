package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Deepak Kumar Khatri
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "220007878";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Deepak Kumar Khatri";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}

	
	@Test
	public void testMaxFebruary28ShouldIncrementToFebruary29() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("testMaxFebruary28ShouldIncrementToFebruary29 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMaxFebruary28ShouldDecrementToFebruary27() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("testMaxFebruary28ShouldDecrementToFebruary27 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(27, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMaxFebruary29ShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("testMaxFebruary29ShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("testMaxMarch31ShouldIncrementToApril1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("testMaxApril30ShouldIncrementToMay1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("testMaxMay31ShouldIncrementToJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("testMaxJune30ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void testMaxJuly31ShouldIncrementToAugust1() {
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("testMaxJuly31ShouldIncrementToAugust1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testMaxAugust31ShouldIncrementToSeptember1() {
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("testMaxAugust31ShouldIncrementToSeptember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("testMaxSeptember30ShouldIncrementToOctober1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("testMaxOctober31ShouldIncrementToNovember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("testMaxNovember30ShouldIncrementToDecember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxDecember31ShouldIncrementToNextYearJanuary1() {
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("testMaxDecember31ShouldIncrementToNextYearJanuary1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(2025, date.getYear());
	}

}
