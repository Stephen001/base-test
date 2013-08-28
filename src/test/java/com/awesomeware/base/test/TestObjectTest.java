package com.awesomeware.base.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * A test class for our sample test object.
 * 
 * @author Stephen Badger [stephen.badger@gmail.com]
 */
public final class TestObjectTest {
	private TestObject object = new TestObject();
	
	/**
	 * Tests the string we get out of our test object is correct.
	 */
	@Test
	public void testString() {
		assertEquals("Hello!", object.getTestString());
	}
}
