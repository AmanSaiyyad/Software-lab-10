package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFumctions junitstring = new jUnitFumctions();
		String result = junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
