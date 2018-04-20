package test.todo.scenario;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import todo.objects.TodoObjects;

public class TodoScenario_simple {

	public WebDriver driver;
		
	public String driverPath="./lib/chromedriver.exe";
	public String url = "http://localhost/dotdash-project/todo/index.php";
		
//	This method is for launching browser and type-in the URL
	@Test (priority=1)
	public void launchBrowserAndURL() throws Exception {
		
		System.out.println("Launching Browser");
		
		String driverPath="./lib/chromedriver.exe";
		String url = "http://localhost/dotdash-project/todo/index.php";
				
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver(); // Launching browser
		driver.manage().window().maximize(); // Maximizing the browser 
		driver.get(url); // Loading the URL
		Thread.sleep(2000);
	}
	
//	This method is for adding task to the list 
	@Test (priority=2)
	public void addTask() throws Exception {
		
		System.out.println("Adding task to the list");
//		This task for incomplete
				
		driver.findElement(By.xpath("//html/body/form/input[3]")).sendKeys("Arun - Incomplete task");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//html/body/form/input[4]")).click();
		Thread.sleep(2000);
		
//		This task for complete
		driver.findElement(By.xpath("//html/body/form/input[3]")).sendKeys("Arun - Complete task");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/form/input[4]")).click();
		Thread.sleep(2000);
		
//		This task for remove
		driver.findElement(By.xpath("//html/body/form/input[3]")).sendKeys("Arun - Task to remove");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/form/input[4]")).click();
		Thread.sleep(2000);
		
		System.out.println("Below Tasks are added : \n 1. Arun - Incomplete task \n 2. Arun - Complete task \n 3. Arun - Task to remove ");
		
	}
	
//	This method is for marking task as complete
	@Test (priority=4)
	public void completeTask() throws Exception {
		
		System.out.println("Completing the task");
		
//		Completing a task
		driver.findElement(By.xpath("html/body/form/pre/input[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/form/input[6]")).click();
		Thread.sleep(3000);
		
		System.out.println("Below task is marked as compelted : \n Arun - Complete task");
		
/*		List<WebElement> listOfAvailableTasks2 = driver.findElements(By.xpath("html/body/form/pre"));
		for (WebElement element : listOfAvailableTasks2) {
			String taskName = element.getText();
			System.out.println(taskName);
			if ((taskName).matches("Task one")) {
				System.out.println("Inside if");
				element.
				break;
			}
			driver.findElement(By.xpath("//html/body/form/input[6]")).click();	
		} */

//		Random randomPosition = new Random();
//		int neededPositionValue=0;
//		
//		WebElement neededPositionValue =  listOfAvailableTasks2.get((listOfAvailableTasks2).indexOf(listOfAvailableTasks2.size()));
//		neededPositionValue.click();
//		
//		driver.findElement(By.xpath("//html/body/form/input[6]")).click();
//		
//		for (WebElement neededPosition : listOfAvailableTasks2) {
//			neededPosition = randomPosition.nextInt();
//		}
		
//		List<WebElement> listOfAvailableTasks2 = driver.findElements(By.xpath("html/body/form/pre/input"));
//		availableTasksCount=listOfAvailableTasks2.size();
//		System.out.println("Available tasks count : " + availableTasksCount);
	} 
		
//	This method is for removing task fromo the list 
	@Test (priority=5)
	public void removeTask() throws Exception {
	
		System.out.println("Removing the task");
		
//		Removing a task
		driver.findElement(By.xpath("html/body/form/pre/input[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/form/input[5]")).click();
		Thread.sleep(3000);
		
		System.out.println("Below task is removed : \n Arun - Task to remove");
	}
	
//	This method is for marking completed task as incomplete 
	@Test (priority=6)
	public void incompleteTask() throws Exception {
	
		System.out.println("Incompleting the task");
		
//		Marking completed task as incomplete
		driver.findElement(By.xpath("html/body/form/pre/input[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/form/input[6]")).click();
		Thread.sleep(3000);
		
		System.out.println("Below task is marked as incomplete : \n Arun - Complete task");
	}	
	
//	This method is for counting task to the list
	@Test (priority=7)
	public void countTask() throws Exception {
		
		System.out.println("Counting number of available tasks");
		
//		Counting all available tasks
		List<WebElement> listOfAvailableTasks1 = driver.findElements(By.xpath("html/body/form/pre/input"));
		int availableTasksCount=listOfAvailableTasks1.size();
		System.out.println("Available tasks count is : " + availableTasksCount);
		
//		List of available tasks
		System.out.println("List of available tasks are below");
		List<WebElement> listOfAvailableTasks = driver.findElements(By.xpath("html/body/form/pre"));
		for (WebElement element : listOfAvailableTasks) {
			String taskName = element.getText();
			System.out.println(taskName);
		}
		
//		Counting all completed tasks
		List<WebElement> listOfCompletedTasks = driver.findElements(By.xpath("html/body/form/pre/strike"));
		int availabeCompletedTaskCount=listOfCompletedTasks.size();
		System.out.println("Available completed task count is : " + availabeCompletedTaskCount);
		
//		Counting all incomplete tasks
		int availableIncompleteTaskCount = availableTasksCount - availabeCompletedTaskCount;
		System.out.println("Available incompleted task count is : " + availableIncompleteTaskCount);
	}	

//	This method is for checking Toggle all
	@Test (priority=8)
	public void toggleAll() throws Exception {
		
		System.out.println("Checking Toggle all functionality");
		
//		Testing Toggle all functionality
		driver.findElement(By.xpath("html/body/form/input[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/form/input[6]")).click();
		Thread.sleep(3000);
		System.out.println("All availabe tasks status are toggled");
		driver.findElement(By.xpath("html/body/form/input[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/form/input[6]")).click();
		System.out.println("All availabe tasks status are toggled again");
	}	
	
//	This method is for removing task - more than one task - for next time execution 
	@Test (priority=9)
	public void removeMoreThanOneTask() throws Exception {
	
		System.out.println("Removing more than one task");
		
//		Removing more than one tasks
		driver.findElement(By.xpath("html/body/form/pre/input[6]")).click();
		driver.findElement(By.xpath("html/body/form/pre/input[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/form/input[5]")).click();
		Thread.sleep(3000);
		
		System.out.println("Arun - Complete task and Arun - Incomplete task are removed for next smooth execution");
	}	
	
//	This method is for adding task to the list 
	@Test (priority=10)
	public void quiiteBrowser() throws Exception {
		
		Thread.sleep(3000);
		driver.quit();
	}
}
