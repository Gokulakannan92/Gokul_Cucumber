package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestSteps {
	

	    public static WebDriver driver;

	    @Given("Chrome browser is launched")
	    public void chrome_browser_is_launched() {

	        driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        System.out.println("Chrome Browser Launched Successfully");
	    }
	    
	    

	    @And("user opens the URL {string}")
	    public void user_opens_the_url(String url) {

	        driver.get(url);

	        System.out.println("Website URL Opened: " + url);
	    }

	    
	    
	    @Then("the page title should be displayed")
	    public void the_page_title_should_be_displayed() {

	        String title = driver.getTitle();

	        System.out.println("Page Title: " + title);

	        if (title == null || title.trim().isEmpty()) {
	            throw new AssertionError("Page title is empty!");
	        }

	        System.out.println("Test Passed: Page title is displayed");
	    }

	    @After
	    public void close_browser() {

	        if (driver != null) {
	            driver.quit();
	            System.out.println("Browser Closed Successfully");
	        }
	    }
	}
	
	
	


