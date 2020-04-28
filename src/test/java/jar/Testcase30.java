package jar;

import org.openqa.selenium.By;

public class Testcase30 extends BrowserUtility {

	public static void main(String[] args)throws Exception {
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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='devname']")));
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");;
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("save")));
		driver.findElement(By.name("save")).click();
		Thread.sleep(1000);
		
		//quitbrowser();

	}

}
