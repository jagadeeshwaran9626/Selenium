package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws AWTException  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagad\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	    WebElement search1 = driver.findElement(By.className("Pke_EE"));
	    search1.click();
	    search1.sendKeys("Iphone 14 pro black");
	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    
	    WebElement img = driver.findElement(By.className("DByuf4"));
        img.click();
}
}
