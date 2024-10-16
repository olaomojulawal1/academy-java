package com.bptn.course.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorDemoTest {


	 private CalculatorTest calculator;


	 @BeforeEach
	 public void setup() {
	  calculator = new CalculatorTest();
	 }


	 @Test
	 public void testAdd() {
	  assertEquals(10, calculator.add(5, 5), "5+5 should equal 10");
	  assertEquals(20, calculator.add(15, 5), "15+5 should equal 20");
	 }


	 @Test
	 public void testSubtract() {
	  assertEquals(10, calculator.subtract(15, 5), "15-5 should equal 10");
	 }


	}