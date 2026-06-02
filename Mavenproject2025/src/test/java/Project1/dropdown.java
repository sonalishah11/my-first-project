package Project1;

import java. util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select dropdown
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdownelement=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown= new Select(dropdownelement);
		
		 //dropdown.selectByIndex(4);*/
		
		//bootstrap dropdown
		
		List<WebElement>options=dropdown.getOptions();
		 System.out.println("Number of count : "  + options.size() );
		 int i;
		 for(i=0; i<options.size();i++) {
			 
			 System.out.println(options.get(i).getText());
		 }
		 
		
		 
		
	}

}
  