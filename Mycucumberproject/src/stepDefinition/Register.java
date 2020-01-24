package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	WebDriver driver;
	@Given("^open chrome and startapplication$")
	public void open_chrome_and_startapplication() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/Register");
		driver.manage().window().maximize();
	}

	@When("^I enter all valid data$")
	public void i_enter_all_valid_data() throws Throwable {
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("krthik123");
		driver.findElement(By.id("LastName")).sendKeys("123kk");
		driver.findElement(By.id("Email")).sendKeys("hello123988@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hello123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("hello123");
		//driver.findElement(By.xpath("//input[@id='register-button']")).click();
	  	}

	@Then("^User should be able to register to application$")
	public void user_should_be_able_to_register_to_application() throws Throwable {
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	 driver.quit();
	}

	}




