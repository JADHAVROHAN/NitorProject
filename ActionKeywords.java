package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords {

		public static WebDriver driver;

	public static void openBrowser(){		
		driver=new FirefoxDriver();
		}

	public static void navigate(){	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		}

	public static void click_MyAccount(){
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		}

	public static void input_Username(){
		driver.findElement(By.id("log")).sendKeys("jadhav_rohan"); 
		}

	public static void input_Password(){
		driver.findElement(By.id("pwd")).sendKeys("2_july_91");
		}

	public static void click_Login(){
		driver.findElement(By.id("login")).click();
		}

	public static void waitFor() throws Exception{
		Thread.sleep(5000);
		}

	public static void click_Logout(){
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
		}

	public static void closeBrowser(){
			driver.quit();
		}

	}
