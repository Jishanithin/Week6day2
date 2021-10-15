package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {

	@When("Click on {string} link")
	public void clickOnCRMSFA(String linkText) {
		driver.findElement(By.linkText(linkText)).click();

	}

	@Then("{string} page should be displayed")
	public void verifyPage(String pageName) {
		System.out.println(pageName + "is displayed");

	}

	@Given("Enter the Company name as {string}")
	public void companyName(String CName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CName);

	}

	@And("Enter the First Name as {string}")
	public void firstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}

	@And("Enter the Last Name as {string}")
	public void lastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

	}

	@When("Click on Create Lead")
	public void submitCreateLead() {
		driver.findElement(By.className("smallSubmit")).click();

	}

}
