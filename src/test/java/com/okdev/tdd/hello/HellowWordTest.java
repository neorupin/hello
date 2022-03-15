package com.okdev.tdd.hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class HellowWordTest {
	private Helloworld hello;
	
	@Before
	public void setup() {
		hello = new Helloworld();
	}
	
	@Test
	public void test() {
		String msg = hello.getMessage();
		assertEquals("Hello World", msg);
	}

	@Test
	public void testGetmessage() {
		String msg = hello.getMessage("neorupin");
		assertEquals("Hello neorupin", msg);
	}
	
	@Test
	public void testGetmessageNull() {
		String msg = hello.getMessage(null);
		assertEquals("Hello World", msg);
	}
	
	@After
	public void tearDown() {
		System.out.println(".....");
	}
}
