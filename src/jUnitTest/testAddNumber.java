package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
		jUnitFumctions junit = new jUnitFumctions();
		int result = junit.addNumbers(100, 200);
		assertEquals (300, result);
	}

}
