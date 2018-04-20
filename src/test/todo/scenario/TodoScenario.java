//package test.todo.scenario;
//
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.TestNG;
//import org.testng.annotations.Test;
//import todo.objects.TodoObjects;
//import todo.operations.TodoOperations;
//
//public class TodoScenario   {
//
//	public WebDriver driver;
////	TodoOperations operation=null;
//	
//	
//	
////	public TodoScenario (WebDriver driver) throws Exception{
////		super(driver);
////		operation= new TodoOperations(driver);
////		this.driver=driver;
////		System.out.println("0");
////	}
//	
////	public String driverPath="C:\\ZZZ_MyFolders\\Bharathi\\chromedriver\\chromedriver.exe";
////	public String url = "http://localhost/dotdash-project/todo/index.php";
//	
////	@Test
//	public void launchURL() throws Exception {
//		System.out.println("1");
//		
//		TodoOperations operation= new TodoOperations(driver);
//			
//		String driverPath="C:\\ZZZ_MyFolders\\Bharathi\\chromedriver\\chromedriver.exe";
//		String url = "http://localhost/dotdash-project/todo/index.php";
//		
////		this.driver=driver;
////		
////		TodoObjects todoObjects = null;
////		todoObjects = new TodoObjects(driver);
//		
//		System.setProperty("webdriver.chrome.driver",driverPath);
//		driver = new ChromeDriver();
//		driver.get(url);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//html/body/form/input[3]")).sendKeys("test 1");
//		driver.findElement(By.xpath("//html/body/form/input[4]")).click();
//		Thread.sleep(3000);
//		operation.addTask();
//		driver.findElement(By.xpath("html/body/form/pre/input[8]")).click();
//		driver.findElement(By.xpath("//html/body/form/input[5]")).click();
//		
//		List<WebElement> availableTasks = driver.findElements(By.xpath("html/body/form/pre/input"));
//		int length=availableTasks.size();
//		System.out.println("Available tasks count : " + length);
//		
//		
////		todoObjects.inputBox.sendKeys("test");
////		todoObjects.addButton.click();
//
//	}
//
//}





package test.todo.scenario;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import todo.operations.TodoOperations;

public class TodoScenario extends TodoOperations {
	
	public static WebDriver driver;
	TodoOperations operation= new TodoOperations(driver);
	
	public TodoScenario(WebDriver driver) throws Exception{
			super(driver);
		
	}
	
	@Test
	public void scenario() throws Exception
	{
		operation.launhcURL();
		operation.addTask();
		
	}
}
