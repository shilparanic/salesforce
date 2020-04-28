package jar;

import org.openqa.selenium.By;

public class Testcase12 extends BrowserUtility {

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
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		driver.findElement(By.xpath("//select[@id='fcf']")).click();
		driver.findElement(By.xpath("//select[@id='fcf']")).sendKeys("shilparai");
		Thread.sleep(1000);
		

	/*	waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='00B5w00000D7B7E_listSelect']")));
		driver.findElement(By.xpath("//select[@id='00B5w00000D7B7E_listSelect']")).sendKeys("shilparai");
		driver.findElement(By.xpath("//select[@id='00B5w00000D7B7E_listSelect']")).click();
		Thread.sleep(1000);*/
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//span[contains(@class,'fBody')]//input[contains(@name,'go')]")));
		driver.findElement(By.xpath("//span[contains(@class,'fBody')]//input[contains(@name,'go')]")).click();
		Thread.sleep(1000);
		
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//div[@id='00B5w00000CyXE1_filterLinks']//a[contains(text(),'Edit')]")));
		driver.findElement(By.xpath("//div[@id='00B5w00000CyXE1_filterLinks']//a[contains(text(),'Edit')]")).click();
		Thread.sleep(1000);

		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("spoorthi");;
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='fcol1']")));
		driver.findElement(By.xpath("//select[@id='fcol1']")).click();
		driver.findElement(By.xpath("//select[@id='fcol1']")).sendKeys("Account Name");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='fop1']")));
		driver.findElement(By.xpath("//select[@id='fop1']")).click();
		driver.findElement(By.xpath("//select[@id='fop1']")).sendKeys("equals");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.xpath("//select[@id='fop1']")));
		driver.findElement(By.xpath("//select[@id='fop1']")).click();
		driver.findElement(By.xpath("//select[@id='fop1']")).sendKeys("equals");
		Thread.sleep(1000);
		

		waitforpageelementtovisible(driver.findElement(By.xpath("//input[@id='fval1']")));
		driver.findElement(By.xpath("//input[@id='fval1']")).click();
		driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("sri");
		Thread.sleep(1000);
		
		waitforpageelementtovisible(driver.findElement(By.name("save")));
		driver.findElement(By.name("save")).click();
	}

}
