package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass  {
	
		public static void main(String[] args) throws InterruptedException, AWTException  {
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			WebElement popup = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
			popup.click();
			Thread.sleep(1000);
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("mobiles");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("Test3");
			List<WebElement> mobilename = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
			int count = mobilename.size();
			System.out.println(count);
			
			for(int i=0;i<count;i++)
			{
				WebElement cname = mobilename.get(i).findElement(By.xpath("//div[contains(@class,'_4rR01T')]"));
				//WebElement cname = mobilename.get(i).findElement(By.xpath("//*[@class='_4rR01T']"));
				String name = cname.getText();
				System.out.println(name);
			}
			
			List<WebElement> price = driver.findElements(By.xpath("//*[@class='_30jeq3 _1_WHN1']"));
			int count1 = mobilename.size();
			System.out.println(count1);
	}

}
