package jar;

import org.openqa.selenium.By;

public class Testcase19 extends BrowserUtility {

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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='quarter_q']")));
		driver.findElement(By.xpath("//select[@id='quarter_q']")).sendKeys("Current FQ");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='open']")));
		driver.findElement(By.xpath("//select[@id='open']")).sendKeys("Open Opportunities");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//table[contains(@class,'opportunitySummary')]//input[contains(@name,'go')]")));
		driver.findElement(By.xpath("//table[contains(@class,'opportunitySummary')]//input[contains(@name,'go')]")).click();;
		Thread.sleep(1000);
	}

}
