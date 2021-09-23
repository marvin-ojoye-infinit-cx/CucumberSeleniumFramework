package CocumberSamples.stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CocumberSamples.TestSuites.DriverUtilities;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static junit.framework.Assert.assertEquals;

//data table with maps : for parameterization of test cases

public class DealsStepWithMapDefinition {

	WebDriver driver;
	WebDriverWait wait;

	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() throws MalformedURLException {
		DriverUtilities.setpropertys();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 60*3);
		((RemoteWebDriver) driver).setLogLevel(Level.INFO);
		
		URL url = new URL("https://freecrm.com/index.html");
		
		driver.get(url.toString());
		Assert.assertEquals(driver.getCurrentUrl(),"https://freecrm.com/index.html");
		//wait.until(ExpectedConditions.urlToBe(url.toString()));
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			System.out.println(data);
			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));

		}

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_hopme_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("CRMPRO", title);
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deals_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

	}

	@Then("^user enters deal details$")
	public void user_enters_contacts_details(DataTable dealData) {

		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {

			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			
			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
			
			//move to new deal page:
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

		}

		
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		DriverUtilities.secureWebDriverClose(driver);
	}
	
	@After
	public void close_the_driver() {
		System.out.println("Driver Quites");
		DriverUtilities.secureWebDriverClose(driver);
	}
}
