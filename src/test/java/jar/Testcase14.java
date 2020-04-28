package jar;

import org.openqa.selenium.By;

public class Testcase14 extends BrowserUtility {

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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		Thread.sleep(1000);
		

		waitforpageelementtovisible(driver.findElement(By.id("ext-gen148")));
		driver.findElement(By.id("ext-gen148")).click();
		driver.findElement(By.id("ext-gen148")).sendKeys("Created Date");
	
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//img[@id='ext-gen150']")));
		driver.findElement(By.xpath("//img[@id='ext-gen150']")).click();
		driver.findElement(By.xpath("//img[@id='ext-gen150']")).sendKeys("Today");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//button[@id='ext-gen49']")));
		driver.findElement(By.xpath("//button[@id='ext-gen49']")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("reportName")));
		driver.findElement(By.name("reportName")).click();
		driver.findElement(By.xpath("//img[@id='ext-gen150']")).sendKeys("Aprilreport");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("reportDevName")));
		driver.findElement(By.name("reportDevName")).click();
		driver.findElement(By.xpath("reportDevName")).sendKeys("Shilpareport");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//button[@id='ext-gen306']")));
		driver.findElement(By.xpath("//button[@id='ext-gen306']")).click();
		Thread.sleep(1000);
		
	}

}
