package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@When("^user passes uname and pwd$")
	public void user_passes_uname_and_pwd() {

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("dinadas1993");

		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
	}

	@When("^user clicks the login button$")
	public void user_clicks_the_login_button() {

		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("^user verifies the home page$")
	public void user_verifies_the_home_page() {

		System.out.println("pass");
	}

}
