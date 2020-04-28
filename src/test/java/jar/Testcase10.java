package jar;

import org.openqa.selenium.By;

public class Testcase10 extends BrowserUtility{

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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		Thread.sleep(1000);

		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='acc2']")));
		driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("srikanth");;
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='acc6']")));
		driver.findElement(By.xpath("//select[@id='acc6']")).click();
		driver.findElement(By.xpath("//select[@id='acc6']")).sendKeys("Technology Partner");
		Thread.sleep(1000);
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='acc6']")));
		driver.findElement(By.xpath("//select[@id='acc6']")).click();
		driver.findElement(By.xpath("//select[@id='acc6']")).sendKeys("Technology Partner");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='00N5w00000HYEuK']")));
		driver.findElement(By.xpath("//select[@id='00N5w00000HYEuK']")).click();
		driver.findElement(By.xpath("//select[@id='00N5w00000HYEuK']")).sendKeys("High");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		Thread.sleep(1000);
		
	}

}
