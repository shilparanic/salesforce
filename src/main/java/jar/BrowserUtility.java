package jar;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
public static WebDriver driver=null;
	
	public static void launchbrowser(String sbrowser) {
	if(sbrowser.startsWith("ch"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else
	{
		System.out.println("you have not given browser type correctly");
	}
	driver.manage().window().maximize();
	driver.get("https://www.salesforce.com/");
	}
	
	public static void excel()throws Exception
	{
		String sFile = "C:\\Users\\jayap\\OneDrive\\Desktop\\salesforcefile.xls";

		FileInputStream fi = new FileInputStream(sFile);


		HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("InsructorInfo");
		HSSFRow row1 = myExcleSheet.getRow(1);

		System.out.println(row1.getCell(0).getStringCellValue());
		System.out.print("\n");
		System.out.println(row1.getCell(1).getNumericCellValue());
		System.out.println(row1.getCell(2).getStringCellValue());
	}
	
	public static void quitbrowser()
	{
		driver.quit();
	}
	public static void logintobrowser() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebDriver driver=BrowserUtility.driver;
		/*wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='username']"))));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shilpa.r@salesforce.com");
	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='password']"))));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
		
		//Login Error Message - 1
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		
		//Login To SalesForce -2
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Login"))));
		driver.findElement(By.name("Login")).click();
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='rememberUn']"))));
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();;
		System.out.println("The checkbox is selection state is - " + driver.findElement(By.xpath("//input[@id='rememberUn']")).isSelected());
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("rememberUn"))));
		driver.findElement(By.name("rememberUn")).click();;
		System.out.println("The checkbox is selection state is - " + driver.findElement(By.name("rememberUn")).isSelected());
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Login"))));
		driver.findElement(By.name("Login")).click();*/
		
		//Thread.sleep(1000);
		
	/*	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	*/
		
		/*wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='error']"))));*/
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	/*	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();*/
		
		//driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
	}
	
		public static void waitforpageelementtovisible(WebElement eletowait)
		{
			WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
			wait.until(ExpectedConditions.visibilityOf(eletowait));
		}	

}
