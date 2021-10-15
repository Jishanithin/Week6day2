package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Deletelead extends BaseClass {

	@When("Click on Delete button")
	public void DeleteLead() {
		driver.findElement(By.className("subMenuButtonDangerous")).click();

	}

	

}
