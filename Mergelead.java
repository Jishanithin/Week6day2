package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mergelead extends BaseClass {
	public List<String> allhandle;
	public List<String> allhandle2;

	


	@When("Click on From Lead icon")
	public void fromlead() {
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();

	}

	@When("Click on First Lead ID")
	public void selectMergeFirstID() {
		Set<String> windowHandles = driver.getWindowHandles();
		allhandle = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allhandle.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(allhandle.get(0));
	}

	@When("Click on To Lead icon")
	public void selectToLead() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		allhandle2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(allhandle2.get(1));
	}

	@When("Click on Second Lead ID")
	public void selectMergesecID() {

		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(allhandle2.get(0));
	}

	@When("Click on ok button")
	public void mergeOk() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	
}
