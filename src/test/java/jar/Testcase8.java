package jar;

import org.openqa.selenium.By;

public class Testcase8 extends BrowserUtility {

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

		waitforpageelementtovisible(driver.findElement(By.xpath("//div[@id='userNav-arrow']")));
		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
            
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")));
		driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).click();
		
		Thread.sleep(1000);

	}

}
