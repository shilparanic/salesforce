package jar;

import org.openqa.selenium.By;

public class Testcase11 extends BrowserUtility {

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
		waitforpageelementtovisible(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]")).click();
		Thread.sleep(1000);

		//a[contains(text(),'Create New View')]
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='fname']")));
		//driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("shilparai");;
		Thread.sleep(1000);
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='devname']")));
		//driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("shilpar");;
		Thread.sleep(1000);
		waitforpageelementtovisible(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")));
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		Thread.sleep(1000);
	}

}
