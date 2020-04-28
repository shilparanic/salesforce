package jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase33 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'shilpa r')]")));
		driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'shilpa r')]")).click();;
		/*WebElement ele = BrowserUtility.driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'shilpa r')]"));
		String stele=ele.getText();
		System.out.println(stele);*/
		Thread.sleep(1000);
		
		
	}

}
