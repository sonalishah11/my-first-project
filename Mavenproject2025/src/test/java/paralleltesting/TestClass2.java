package paralleltesting;

import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void testmethod4() {
		
		System.out.println("TestClass2 >> testmethod4 >> "+ Thread.currentThread().getId());
		
	}
	@Test
   public void testmethod5() {
		
		System.out.println("TestClass2 >> testmethod5 >>  "+ Thread.currentThread().getId());
}
	@Test
   public void testmethod6() {
		
		System.out.println("TestClass2 >> testmethod6 >>  "+ Thread.currentThread().getId());
		
		
   }
}
