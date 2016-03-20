package com.demo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	// f(1) = 1
	// 1
	@Test
	public void testInputOne() {
		Assert.assertEquals(1, App.countPossibilities(1));
	}

	// f(2) = 2
	// 1,1
	//
	// 2
	@Test
	public void testInputTwo() {
		Assert.assertEquals(2, App.countPossibilities(2));
	}

	// f(3) = 4
	// 1,1,1
	//
	// 2,1
	// 1,2
	//
	// 3
	@Test
	public void testInputThree() {
		Assert.assertEquals(4, App.countPossibilities(3));
	}

	// f(4) = 8
	// 1,1,1,1
	//
	// 2,1,1
	// 1,2,1
	// 1,1,2
	//
	// 3,1
	// 1,3
	//
	// 4
	//
	// 2,2
	@Test
	public void testInputFour() {
		Assert.assertEquals(8, App.countPossibilities(4));
	}

	// f(5) = 15
	// 1,1,1,1,1
	//
	// 2,1,1,1
	// 1,2,1,1
	// 1,1,2,1
	// 1,1,1,2
	//
	// 2,2,1
	// 2,1,2
	// 1,2,2
	//
	// 3,1,1
	// 1,3,1
	// 1,1,3
	//
	// 3,2
	// 2,3
	//
	// 4,1
	// 1,4
	@Test
	public void testInputFive() {
		Assert.assertEquals(15, App.countPossibilities(5));
	}

}
