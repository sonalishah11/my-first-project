package paralleltesting;

import org.testng.annotations.Test;

public class TestClass3 {

	@Test
	public void testmethod7() {
		
		System.out.println("TestClass3 >> testmethod7 >> "+ Thread.currentThread().getId());
		
	}
	@Test
   public void testmethod8() {
		
		System.out.println("TestClass3 >> testmethod8 >> "+ Thread.currentThread().getId());
}
	@Test
   public void testmethod9() {
		
		System.out.println("TestClass3 >> testmethod9 >> "+ Thread.currentThread().getId());
		
		
   }
	
}
