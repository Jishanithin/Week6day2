package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {
	
	

	
	@Given("Enter the FName as {string}")
	public void editSearch(String Name) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(Name);

	}
	@When("Click on Find Leads")
	public void findLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@When("Click First Leads")
	public void firstLead() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class='linktext'])[1]"))
				.click();

	}

	@Given("Enter the new Company name as {string}")
	public void newCompanyName(String ComName) {
		WebElement newCom = driver.findElement(By.id("updateLeadForm_companyName"));
		newCom.clear();
		newCom.sendKeys(ComName);

	}

	@When("Click on 'Update' button link")
	public void update() {
		driver.findElement(By.className("smallSubmit")).click();

	}
	
}
