package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class datepickers {

static void futuremonthyear(WebDriver driver, String year, String month, String date) {
	
	

	 while(true) {
		 
		 String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		 String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		 
		 if(currentmonth.equals(month) && currentyear.equals(year) ) {
			 break;
			 
		 }
		 //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//forward
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//backward
	 }
	 
	 
		
		 List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/ td/a"));
		 
	     for(WebElement dt:allDates) {
	    	 
	    	 if(dt.getText().equals(date)) {
	    		 
	    		 dt.click();
	    		 break;
	    	 }
	    	 
	     }
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		//Method 1:
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/06/2025");
		
		
		//Method 2:
		
		String year= "2025";
		String month="May";
		String date="6";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
			 
		futuremonthyear(driver,year,month,date);
			 
		 
		
    	 
     
	}

}
