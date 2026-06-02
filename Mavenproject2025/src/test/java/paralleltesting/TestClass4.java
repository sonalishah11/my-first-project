package paralleltesting;

import org.testng.annotations.Test;

public class TestClass4 {

	@Test
	public void testmethod10() {
		
		System.out.println("TestClass4 >> testmethod10 >> "+ Thread.currentThread().getId());
		
	}
}
