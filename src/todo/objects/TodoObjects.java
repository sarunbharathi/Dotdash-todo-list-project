package todo.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;

public class TodoObjects {
	
	
	WebDriver driver;
	public WebElement inputBox = null;
	public WebElement addButton=null;
	public WebElement taskForCompelte = null;
	public WebElement completeButton = null; 
	public WebElement taskForRemoving =  null;
	public WebElement removeButton = null;
	public WebElement taskForIncomplete = null;
	public List<WebElement> listOfAvailableTasks = null;
	public List<WebElement> listOfCompletedTasks = null;
	public WebElement toggleAll = null;
	public WebElement task1ForRemoving = null;
	public WebElement task2ForRemoving = null;
	
			
	public TodoObjects (WebDriver driver) throws Exception
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	{
	WebElement inputBox=driver.findElement(By.xpath("//html/body/form/input[3]"));
	WebElement addButton=driver.findElement(By.xpath("//html/body/form/input[4]"));
	
//	Objects for marking task as complete
	WebElement taskForCompelte = driver.findElement(By.xpath("html/body/form/pre/input[7]"));
	WebElement completeButton = driver.findElement(By.xpath("//html/body/form/input[6]"));
	
//	Objects for removing a task
	WebElement taskForRemoving = driver.findElement(By.xpath("html/body/form/pre/input[8]"));
	WebElement removeButton = driver.findElement(By.xpath("//html/body/form/input[5]"));
	
//	Objects for marking completed task as incomplete
	WebElement taskForIncomplete = driver.findElement(By.xpath("html/body/form/pre/input[7]"));
		
//	Objects for counting tasks
	List<WebElement> listOfAvailableTasks = driver.findElements(By.xpath("html/body/form/pre/input"));
	List<WebElement> listOfCompletedTasks = driver.findElements(By.xpath("html/body/form/pre/strike"));
	
//	Objects for testing toggle all functionality
	WebElement toggleAll = driver.findElement(By.xpath("html/body/form/input[2]"));
		
//	Objects for removing more than one task
	WebElement task1ForRemoving = driver.findElement(By.xpath("html/body/form/pre/input[6]"));
	WebElement task2ForRemoving = driver.findElement(By.xpath("html/body/form/pre/input[7]"));
	
	}
}
