package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagad\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	     driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=3491816614459414546&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9183492&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	     driver.manage().window().maximize();
	     
	     String title = driver.getTitle();
	     System.out.println(title);
	     WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	     search.sendKeys("Iphone 14 pro black");
	    
	     WebElement button = driver.findElement(By.id("nav-search-submit-button"));
	     button.click();
	     
	     WebElement img =  driver.findElement(By.xpath("//img[@class='s-image'][1]"));
	     img.click();
	     
	   }
}
