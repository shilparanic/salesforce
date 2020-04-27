package jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Testcase1 extends BrowserUtility {

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

Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='password']")).clear();

waitforpageelementtovisible(driver.findElement(By.name("Login")));
driver.findElement(By.name("Login")).click();

	}

}
