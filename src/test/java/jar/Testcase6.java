package jar;

import org.openqa.selenium.By;

public class Testcase6 extends BrowserUtility{

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

		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")));
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")));
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(4000);
		
	   //waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'About')]")));
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(2000);
		
		/*waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='lastName']")));
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Rai");
		Thread.sleep(2000);(updating last name each time i run program so commented)*/
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")));
		driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")));
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("cke_publisherRichTextEditor"));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")));
		//Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/p[1]")).sendKeys("Hi I am ShilpaRai");
		Thread.sleep(4000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
	}

}
