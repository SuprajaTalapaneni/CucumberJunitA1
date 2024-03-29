package stepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//These are the changes done for skillrary
public class SkillraryLoginSteps {
	WebDriver driver;
//Before hook
	@Before
	public void beforeScenario() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Enter to login page")
	public void enter_to_login_page() {
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
	}

	@When("when i provide valid credentials")
	public void when_i_provide_valid_credentials() {
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
	}

	@And("hit on login")
	public void hit_on_login() {
		driver.findElement(By.id("last")).click();
	}

	@Then("I should navigate to Homepage")
	public void i_should_navigate_to_homepage() {
		try {
			driver.findElement(By.xpath("//span[text()='SkillRary Admin']"));
			System.out.println("Test Pass");
		} catch (Exception e) {
			System.out.println("Test Fail");
		}
	}

	@When("^when i provide (.) and (.)$")
	public void whenn_i_provide_user_and_user(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@After
	public void afterScenario() {
		driver.quit();
	}
}
