package test.todo.scenario;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import todo.objects.TodoObjects;

public class TodoScenario_simple2 {

	public WebDriver driver;
		
	public String driverPath="C:\\ZZZ_MyFolders\\Bharathi\\chromedriver\\chromedriver.exe";
	public String url = "http://localhost/dotdash-project/todo/index.php";
		
//	This method is for launching browser and type-in the URL
	@Test (priority=1)
	public void launchBrowserAndURL() throws Exception {
		
		System.out.println("Launching Browser");
		
		String driverPath="C:\\ZZZ_MyFolders\\Bharathi\\chromedriver\\chromedriver.exe";
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

//		Add task objects
		WebElement inputBox = driver.findElement(By.xpath("html/body/form/input[3]"));
		WebElement addButton = driver.findElement(By.xpath("html/body/form/input[4]"));
		
//		This task for incomplete	
		inputBox.click();
		inputBox.sendKeys("Arun - Incomplete task");
		Thread.sleep(1000);
		addButton.click();
		Thread.sleep(2000);
		
//		This task for complete
		inputBox.click();
		inputBox.sendKeys("Arun - Complete task");
		Thread.sleep(2000);
		addButton.click();
		Thread.sleep(2000);
		
//		This task for remove
		inputBox.click();
		inputBox.sendKeys("Arun - Task to remove");
		Thread.sleep(2000);
		addButton.click();
		Thread.sleep(2000);
		
		System.out.println("Below Tasks are added : \n 1. Arun - Incomplete task \n 2. Arun - Complete task \n 3. Arun - Task to remove ");
		
	}
	
//	This method is for marking task as complete
	@Test (priority=4)
	public void completeTask() throws Exception {
		
		System.out.println("Completing the task");
		
//		Objects for marking task as complete
		WebElement taskForCompelte = driver.findElement(By.xpath("html/body/form/pre/input[7]"));
		WebElement completeButton = driver.findElement(By.xpath("//html/body/form/input[6]"));
		
//		Marking a task as complete
		taskForCompelte.click();
		Thread.sleep(2000);
		completeButton.click();
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
		
//		Objects for removing a task
		WebElement taskForRemoving = driver.findElement(By.xpath("html/body/form/pre/input[8]"));
		WebElement removeButton = driver.findElement(By.xpath("//html/body/form/input[5]"));
		
//		Removing a task
		taskForRemoving.click();
		Thread.sleep(2000);
		removeButton.click();
		Thread.sleep(3000);
		
		System.out.println("Below task is removed : \n Arun - Task to remove");
	}
	
//	This method is for marking completed task as incomplete 
	@Test (priority=6)
	public void incompleteTask() throws Exception {
	
		System.out.println("Incompleting the task");
		
//		Objects for marking completed task as incomplete
		WebElement taskForIncomplete = driver.findElement(By.xpath("html/body/form/pre/input[7]"));
		WebElement completeButton = driver.findElement(By.xpath("//html/body/form/input[6]"));
		
//		Marking completed task as incomplete
		taskForIncomplete.click();
		Thread.sleep(2000);
		completeButton.click();
		Thread.sleep(3000);
		
		System.out.println("Below task is marked as incomplete : \n Arun - Complete task");
	}	
	
//	This method is for counting task to the list
	@Test (priority=7)
	public void countTask() throws Exception {
		
		System.out.println("Counting number of available tasks");
		
//		Objects for counting tasks
		List<WebElement> listOfAvailableTasks = driver.findElements(By.xpath("html/body/form/pre/input"));
		List<WebElement> listOfCompletedTasks = driver.findElements(By.xpath("html/body/form/pre/strike"));
		
//		Calculating available tasks
		int availableTasksCount=listOfAvailableTasks.size();
		System.out.println("Available tasks count is : " + availableTasksCount);
			
//		Calculating completed tasks
		int availabeCompletedTaskCount=listOfCompletedTasks.size();
		System.out.println("Available completed task count is : " + availabeCompletedTaskCount);
		
//		Calculating incomplete tasks
		int availableIncompleteTaskCount = availableTasksCount - availabeCompletedTaskCount;
		System.out.println("Available incompleted task count is : " + availableIncompleteTaskCount);
	}	

//	This method is for checking Toggle all
	@Test (priority=8)
	public void toggleAll() throws Exception {
		
		System.out.println("Checking Toggle all functionality");
		
//		Objects for testing toggle all functionality
		WebElement toggleAll = driver.findElement(By.xpath("html/body/form/input[2]"));
		WebElement completeButton = driver.findElement(By.xpath("//html/body/form/input[6]"));
		
//		Checking Toggle all button functionality
		toggleAll.click();
		Thread.sleep(2000);
		completeButton.click();
		Thread.sleep(3000);
		System.out.println("All availabe tasks status are toggled");
		toggleAll.click();
		Thread.sleep(2000);
		completeButton.click();
		System.out.println("All availabe tasks status are toggled again");
	}	
	
//	This method is for removing task - more than one task - for next time execution 
	@Test (priority=9)
	public void removeMoreThanOneTask() throws Exception {
	
		System.out.println("Removing more than one task");
		
//		Objects for removing more than one task
		WebElement task1ForRemoving = driver.findElement(By.xpath("html/body/form/pre/input[6]"));
		WebElement task2ForRemoving = driver.findElement(By.xpath("html/body/form/pre/input[7]"));
		WebElement removeButton = driver.findElement(By.xpath("//html/body/form/input[5]"));
		
//		Removing more than one tasks - removing Created tasks for next smooth execution
		task1ForRemoving.click();
		task2ForRemoving.click();
		Thread.sleep(2000);
		removeButton.click();
		Thread.sleep(3000);
		
		System.out.println("Arun - Complete task and Arun - Incomplete task are removed for next smooth execution");
	}	
	
//	This method is for closing the browser
	@Test (priority=10)
	public void quiiteBrowser() throws Exception {
		
		Thread.sleep(3000);
		driver.quit();
	}
}
