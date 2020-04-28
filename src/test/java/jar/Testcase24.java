package jar;

import org.openqa.selenium.By;

public class Testcase24 extends BrowserUtility{

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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(1000);
		
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");;
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='lea3']")));
		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("save")));
		driver.findElement(By.name("save")).click();
		Thread.sleep(1000);
		
		quitbrowser();
	}

}
