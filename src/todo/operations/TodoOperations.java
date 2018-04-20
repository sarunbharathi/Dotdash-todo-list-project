package todo.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import todo.objects.TodoObjects;

public class TodoOperations {
	
	public static WebDriver driver;
	TodoObjects object= new TodoObjects(driver);
	
	public TodoOperations(WebDriver driver) throws Exception{
			this.driver=driver;
		
	}
	
	public void launhcURL() throws Exception
	{
		String driverPath="C:\\ZZZ_MyFolders\\Bharathi\\chromedriver\\chromedriver.exe";
		String url = "http://localhost/dotdash-project/todo/index.php";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
	}
	
	public void addTask() throws Exception
	{
		object.inputBox.sendKeys("good");
		object.addButton.click();
	}
	
	public void completeTask() throws Exception {
		
		object.taskForCompelte.click();
		Thread.sleep(2000);
		object.completeButton.click();
		Thread.sleep(3000);
	}
	
	public void removeTask() throws Exception {
		
		object.taskForRemoving.click();
		Thread.sleep(2000);
		object.removeButton.click();
		Thread.sleep(3000);
		
		System.out.println("Below task is removed : \n Arun - Task to remove");
	}
}
