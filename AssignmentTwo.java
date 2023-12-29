package testngdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssignmentTwo {
	    WebDriver driver;
	  @BeforeTest 
	    public void beforetest() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Krih\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver.navigate().to("https://www.demoblaze.com/");
        System.out.println("Browser start successfully");
        Thread.sleep(1000);
        }
	  @Test(priority=0)
	    public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginusername")).sendKeys("yadavsamar0012");
		Thread.sleep(1000);
		driver.findElement(By.id("loginpassword")).sendKeys("Samar@0012");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		}
	    
	  @Test(priority=1)
		public void laptop() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id=\"itemc\"])[2]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	    Thread.sleep(2000);				
	    Alert alert = driver.switchTo().alert();	
	    Thread.sleep(4000);
	    // Capturing alert message.    
	    String alertMessage= driver.switchTo().alert().getText();		
	    // Displaying alert message		
	    System.out.println(alertMessage);	
		Thread.sleep(1000);
		// Accepting alert		
        alert.accept();	
        Thread.sleep(1000);	        		
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(2000);	        
	  }	        

	 @Test(priority=2)
	    public void mobile() throws InterruptedException {
	    driver.findElement(By.xpath("(//*[@id=\"itemc\"])[1]")).click();
	    Thread.sleep(1000);			
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();	
	    Thread.sleep(4000);
		    }
		   
	  @Test(priority=3)
		public void contact() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		 Thread.sleep(1000);
			
		 driver.findElement(By.id("recipient-email")).sendKeys("yadavvivekkumar8097@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.id("recipient-name")).sendKeys("VivekYadav");
		 Thread.sleep(1000);
		 driver.findElement(By.id("message-text")).sendKeys("I am the new customer");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		 Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();	
	     Thread.sleep(2000);
		 // Capturing alert message.    
		 String alertMessage= driver.switchTo().alert().getText();		
		        		
		 // Displaying alert message		
		 System.out.println(alertMessage);	
		 Thread.sleep(3000);
		        		
		 alert.accept();				
		}
		@Test(priority=5)
		public void Aboutus() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
		}
		
		@Test(priority=6)
		public void Cart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		Thread.sleep(3000);
			}		
		@Test(priority=7)
		public void Oraderplace() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Vivek");
	    Thread.sleep(1000);
		driver.findElement(By.id("country")).sendKeys("India");
	    Thread.sleep(1000);
	    driver.findElement(By.id("city")).sendKeys("Mumbai");
		Thread.sleep(1000);
			 
	    driver.findElement(By.id("card")).sendKeys("Master");
		Thread.sleep(1000);
		driver.findElement(By.id("month")).sendKeys("12");
		Thread.sleep(1000);
	    driver.findElement(By.id("year")).sendKeys("2024");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
	    Thread.sleep(3000);
		//Screenshot
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Krih\\Desktop\\Screenshot.png"));
		 Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		    System.out.println("Your order is placed.we will contact you shortly Thank you!! Visit Again");
				}
			@AfterSuite
			public void exit() {
				
			driver.quit();	
	   }	
		
    }		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
				
		

	  
	  
	  
	  
	  

