package Project1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://www.flipkart.com/");
		
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        
        Thread.sleep(5000);
        
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        
        Thread.sleep(5000);
        driver.navigate().refresh();
	}

}
