package parctice;





import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class allfunction {

    private static Object TakeScreenshot;

	public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.flipkart.com/");
        //driver.get("https://www.facebook.com/");
        //driver.get("https://demo.automationtesting.in/Static.html");
        //driver.manage().window().maximize();
        //Thread.sleep(5000);

         //Click anywhere on page to activate focus
          /*driver.findElement(By.tagName("body")).click();
          JavascriptExecutor js= (JavascriptExecutor) driver;
          js.executeScript("window.scrollTo (0, document.body.scrollHeight)");*/
     //TS
         /*TakesScreenshot tc= (TakesScreenshot) driver;
          File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("E:\\ss\\screenshot.png"));*/ 
        
        //drag&drop
        
        /*WebElement source= driver.findElement(By.id("angular"));
        WebElement target= driver.findElement(By.id("droparea"));
        
        Actions act= new Actions(driver); 
        act.dragAndDrop(source, target).perform();*/
        
        
        //Right Click, double click
        //WebElement rc= driver.findElement(By.xpath("//img[@id= 'angular']"));
        //WebElement dc= driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[3]/a"));
        //WebElement dc= driver.findElement(By.xpath("//a[text()='WebTable']"));
        
        
        //Actions act= new Actions(driver);
        //act.contextClick(rc).perform();
        //act.doubleClick(dc).perform();
        //WebElement mte= driver.findElement(By.xpath("//span[@class='fa fa-facebook-square']"));
        //act.moveToElement(mte).click().perform();
        
        
        //Alert
        //driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.manage().window().maximize();
		
		 
		 //for promt handle with ok /cancel & pass any keyword in the box
		 //WebElement alert =driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		 //WebElement alert =driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		//WebElement alert =driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		 //alert.click();
		 // Thread.sleep(5000);
		 
		  
		 //driver.switchTo().alert().accept(); 
		 //driver.switchTo().alert().dismiss();
		  /*Alert myalert = driver.switchTo().alert();
		  myalert.sendKeys("welcome");
		  myalert.accept();*/
		 
		 
		 
		 
		//Checkboxes
		/*driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
			 List<WebElement>checkboxes = driver.findElements(By.xpath("//input[@type= 'checkbox' and @class='form-check-input']"));
			 /*for(int i=0; i<checkboxes.size(); i++) {
				 checkboxes.get(i).click(); 
			 };*/
		 
		
		/*for (WebElement checkbox:checkboxes) {
			checkbox.click();
		 
		}*/
		
		//Specific checkbox
			 /*for(int i=0; i<3; i++) {
				 checkboxes.get(i).click();
			 };*/
		
		
		
		//new window tab
		/*driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		//when two url given and want to open separately
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://orangehrm.com/");
				driver.manage().window().maximize();
				
				
				List<String>id= new ArrayList(driver.getWindowHandles());
				
				//driver.switchTo().window(id.get(1));
				
				driver.switchTo().window(id.get(0));*/ 
        
        //validate text in selenium
       
        
        /*WebElement headline = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1"));

        String actualText = headline.getText();
        String expectedText = "Automation Demo Site";

        Assert.assertEquals(actualText, expectedText, "Automation Demo Site text is matching");*/
   
        /*driver.get("https://en.wikipedia.org/wiki/Love_Story_(Taylor_Swift_song)");

        String actualText = driver.findElement(
                By.xpath("//span[@class='mw-page-title-main']")
        ).getText();

        String expectedText = "Love Story (Taylor Swift song)";

        Assert.assertEquals(actualText, expectedText, "Title does not match");*/
        
        //Handle multiple windows 
        
        driver.get("https://demoqa.com/browser-windows");

        // Click to open new window
        driver.findElement(By.id("tabButton")).click();

        // Parent window 
        String parentWindow = driver.getWindowHandle();

        // All windows
        //List<String> allWindows = new ArrayList(driver.getWindowHandles());
        Thread.sleep(3000);
        List<String>id= new ArrayList(driver.getWindowHandles());
      
        driver.switchTo().window(parentWindow);
        driver.switchTo().window(id.get(1));
	
				
    }

	
	}
		
		
		
		
	
