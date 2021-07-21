/*
 * https://www.youtube.com/watch?v=Xc3d6j8Rm_I
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.StringHelper;

public class StringHelperTest {
	StringHelper stringhelper = new StringHelper();
	// Commit 1
	@Test
	public void testStrWith2CharsIsReversed() {
		assertEquals("BA", stringhelper.swapLast2Chars("AB"));
	}
	// Commit 2
	@Test
	public void testStrWith4CharsIsReversed() {
		assertEquals("ABDC", stringhelper.swapLast2Chars("ABCD"));
	}
	// Commit 3
	@Test
	public void testStrWith10CharsIsReversed() {
		assertEquals("ABCDEFGHJI", stringhelper.swapLast2Chars("ABCDEFGHIJ"));
	}
}
