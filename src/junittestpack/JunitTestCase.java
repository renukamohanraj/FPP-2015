package junittestpack;

import static org.junit.Assert.*;

import org.junit.Test;


public class JunitTestCase {

	@Test
	public void test1() {
		ArithOpeTest obj = new ArithOpeTest();
		int out = obj.add(10,20); // Original output returned by method
		int eout = 30; // Expected output
		assertEquals(out,eout);
	}
	
	@Test
	public void test2() {
		ArithOpeTest obj = new ArithOpeTest();
		int out = obj.sub(100,20); // Original output returned by method
		int eout = 80; // Expected output
		assertEquals(out,eout);
	}
	
}
