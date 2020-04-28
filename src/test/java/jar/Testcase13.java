package jar;

import org.openqa.selenium.By;

public class Testcase13 extends BrowserUtility {

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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='srch']")));
		driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("sri");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("srchbutton")));
		driver.findElement(By.name("srchbutton")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='cid0']")));
		driver.findElement(By.xpath("//input[@id='cid0']")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='cid1']")));
		driver.findElement(By.xpath("//input[@id='cid1']")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("goNext")));
		driver.findElement(By.name("goNext")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("save")));
		driver.findElement(By.name("save")).click();
		Thread.sleep(1000);
		
		
		
	}

}
