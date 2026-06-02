package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mavenproject1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	   WebDriver driver= new ChromeDriver();
	   //driver.get("https://www.flipkart.com/"); 
	   driver.get("https://demo.nopcommerce.com/");
	   driver.manage().window().maximize(); 
	   Thread.sleep(5000);
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
	   
	   //driver.findElement(By.linkText("Mobiles & Tablets")).click();
	  // String act_title=driver.getTitle();
	//Set<String>window=driver.getWindowHandles();
	//System.out.println(window);
	
	  //[884551CC774313E985AF77D733473E13] 
	   //driver.findElement(By.xpath("//input[@ name='q'and @placeholder= 'Search for Products, Brands and More']")).sendKeys("top");
	   //System.out.println(headerstatus);
	   //List<WebElement>link= driver.findElements(By.tagName("a"));
	   //System.out.println(link.size());
	   //driver.findElement(By.xpath("//a[text()='Register']")).click(); 
	   //boolean option =driver.findElement(By.xpath("//input[@value='M']")).isSelected();
	   //System.out.println(option);
	  
	  
	   //driver.findElement(By.xpath("//input[@value='F']")).click(); 
	   //boolean status =driver.findElement(By.xpath("//input[@value='F']")).isSelected();
	   //System.out.println(status);
	   //driver.quit();
	   
	   
	
	   
	   
	   } 
}
