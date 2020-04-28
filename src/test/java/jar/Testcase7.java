package jar;

import org.openqa.selenium.By;

public class Testcase7 extends BrowserUtility {

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

		waitforpageelementtovisible(driver.findElement(By.xpath("//div[@id='userNav-arrow']")));
		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();

		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")));
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']")));
		driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']")).click();
		
Thread.sleep(1000);
		
		/*waitforpageelementtovisible(driver.findElement(By.xpath("//div[@id='PersonalInfo']//span[@class='accordionIcon expand_icon']")));
		driver.findElement(By.xpath("//div[@id='PersonalInfo']//span[@class='accordionIcon expand_icon']")).click();
		
Thread.sleep(1000);*/
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[@id='LoginHistory_font']")));
		driver.findElement(By.xpath("//a[@id='LoginHistory_font']")).click();
		
		Thread.sleep(1000);
		

		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
		
		Thread.sleep(1000);
	}

}
