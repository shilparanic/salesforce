package jar;

import org.openqa.selenium.By;

public class Testcase23 extends BrowserUtility{

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		driver.findElement(By.xpath("//select[@id='fcf']")).sendKeys("Today's Leads");;
		Thread.sleep(2000);
		
		waitforpageelementtovisible(driver.findElement(By.name("go")));
		driver.findElement(By.name("go")).click();;
		Thread.sleep(2000);
		quitbrowser();
	}

}
