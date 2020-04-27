package jar;

import org.openqa.selenium.By;

public class Testcase4A extends BrowserUtility{

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


		waitforpageelementtovisible(driver.findElement(By.xpath("//a[@id='forgot_password_link']")));
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
	
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='un']")));
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("shilpa.r@salesforce.com");
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='continue']")));
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}

}
