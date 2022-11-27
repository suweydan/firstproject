package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {

	public static WebDriver driver;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@And("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String pass) {

		driver.findElement(By.id("email")).sendKeys(uname);

		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@When("user click on login")
	public void user_click_on_login() {
		// click
	}

	@Then("page tiltle should be {string}")
	public void page_tiltle_should_be(String title1) {
		String title = driver.getTitle();
		if (title.contains(title1)) {
			System.out.println("title matched");
		} else {
			System.out.println("tilte not matched");
		}

	}

	@And("close browser")
	public void close_browser() {
		driver.close();
		System.out.println("closing browser");
	}

}
