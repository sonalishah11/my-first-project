   package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Handlingslider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		/*driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver); 
		WebElement minslider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));// 59, 252
		System.out.println("x and y axis minslider value"+ minslider.getLocation());
        act.dragAndDropBy(minslider, 100, 252).perform();
        WebElement maxslider= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
        System.out.println("x and y axis after minslider value"+ maxslider.getLocation());
        act.dragAndDropBy(maxslider,-100,252).perform();*/
		
		
		/*driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome");
		
		Actions act= new Actions(driver);
		//control A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//control C 
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//tab 
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//control v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();*/
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		/*WebElement reglink=driver.findElement(By.xpath("//a[@class='ico-register']"));
		
		Actions act= new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(reglink).keyDown(Keys.CONTROL).perform();
		
		List<String>id= new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(id.get(1));*/
		
		//driver.switchTo().window(id.get(0));
		
		
		
		//when two url given and want to open separately
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://orangehrm.com/");
		driver.manage().window().maximize();
		
		
	}
	
	

}//*[@id="slider-range"]/span[2]
//*[@id="slider-range"]/div