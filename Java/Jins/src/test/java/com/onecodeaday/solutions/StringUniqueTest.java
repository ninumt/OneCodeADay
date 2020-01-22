/**
 * 
 */
package com.onecodeaday.solutions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author jins.george
 *
 */
public class StringUniqueTest {

	@Test
	public void test() {
		assertTrue(StringUnique.isUnique("abcd"));
		assertFalse(StringUnique.isUnique("abcda"));
		assertFalse(StringUnique.isUnique("A63x6"));
		assertTrue(StringUnique.isUnique("jins G"));
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNull() {
		StringUnique.isUnique(null);
		
	}
	
}
