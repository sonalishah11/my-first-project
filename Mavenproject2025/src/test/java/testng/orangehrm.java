package testng;

import org.testng.annotations.Test;

public class orangehrm {
  @Test (priority=1)
  void openapp() {
	 System.out.println("opening app"); 
  }
  
  
  @Test (priority=2)
  void loginapp() {
	 System.out.println("login app"); 
  }
  
  @Test (priority=3)
  void logoutapp() {
	 System.out.println("logout app"); 
  }
  
  
}
