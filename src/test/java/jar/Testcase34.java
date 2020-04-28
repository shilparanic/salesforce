package jar;

import org.openqa.selenium.By;

public class Testcase34 extends BrowserUtility{

	public static void main(String[] args) throws Exception{
		
		launchbrowser("ch");
		logintobrowser();
		//WebDriver driver=BrowserUtility.driver;
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'Login')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

		Thread.sleep(1000);
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='username']")));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shilpa.r@salesforce.com");

		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='password']")));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");

		waitforpageelementtovisible(driver.findElement(By.name("Login")));
		driver.findElement(By.name("Login")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//span[contains(@class,'mruText')][contains(text(),'shilpa r')]")));
		driver.findElement(By.xpath("//span[contains(@class,'mruText')][contains(text(),'shilpa r')]")).click();;
		Thread.sleep(3000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")));
		driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")).click();;
		Thread.sleep(1000);
		

		//waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")));
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(4000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'About')]")));
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(4000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='lastName']")));
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("jai");
		
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		Thread.sleep(4000);
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")));
		driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();;;
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		
	}
	

}
