package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void test_case1() {
		Assert.assertEquals(true, true);
		Reporter.log("test_case1 passed", true);
	}
	
	@Test
	public void test_case2() {
		Assert.assertEquals(false, true);
		Reporter.log("test_case2 passed", true);
	}
	
	@Test
	public void test_case3() {
		Assert.assertEquals(true, false);
		Reporter.log("test_case3 passed", true);
	}
	
	@Test
	public void test_case4() {
		Assert.assertEquals(false, false);
		Reporter.log("test_case4 passed", true);
	}
	
	@Test
	public void test_case5() {
		Assert.assertEquals(false, true);
		Reporter.log("test_case5 passed", true);
	}

}
