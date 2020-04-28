package jar;

import org.openqa.selenium.By;

public class Testcase16 extends BrowserUtility{

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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("new")));
		driver.findElement(By.name("new")).click();
		Thread.sleep(1000);
		
		
		waitforpageelementtovisible(driver.findElement(By.name("opp3")));
		driver.findElement(By.name("opp3")).sendKeys("spoorthi");;
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("opp4")));
		driver.findElement(By.name("opp4")).sendKeys("sriram");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'4')]")));
		driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='opp11']")));
		driver.findElement(By.xpath("//select[@id='opp11']")).sendKeys("Needs Analysis");;
		Thread.sleep(1000);
		/*
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='opp17']")));
		driver.findElement(By.xpath("//input[@id='opp17']")).sendKeys("review");;
		Thread.sleep(1000);primary campaign source is not available*/
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='opp6']")));
		driver.findElement(By.xpath("//select[@id='opp6']")).sendKeys("Web");;
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("save")));
		driver.findElement(By.name("save")).click();
		Thread.sleep(1000);
		
		
		
	}

}
