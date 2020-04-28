package jar;

import org.openqa.selenium.By;

public class Testcase32 extends BrowserUtility{

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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[contains(@name,'new')]")));
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Indian");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='con4']")));
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Global Media");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("save_new")));
		driver.findElement(By.name("save_new")).click();
		Thread.sleep(1000);

	}

}
