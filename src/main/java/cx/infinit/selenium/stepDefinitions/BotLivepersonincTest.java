package cx.infinit.selenium.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cx.infinit.selenium.InfinitBotTest.BotComandEnum;
import cucumber.api.java.en.Then;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CocumberSamples.TestSuites.DriverUtilities;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;


public class BotLivepersonincTest {

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(className = ".LPMoverlay")
	By ChatopenerButton = By.cssSelector(".LPMoverlay");
	
	@FindBy(xpath = "//div[@id='LP_ChatViewController_1']/div[2]/div/textarea")
	By MtextField = By.xpath("//div[@id='LP_ChatViewController_1']/div[2]/div/textarea");
	
	@FindBy(xpath = "//button[@class='lp_send_button lpc_composer__send-button lpc_desktop']")
	By SendButton = By.xpath("//button[@class='lp_send_button lpc_composer__send-button lpc_desktop']");
	
	@FindBy(xpath = "//p[contains(text(),'OPTIONS:')]")
	By BotOptionsmenu =  By.xpath("//p[contains(text(),'OPTIONS:')]");
	
	@FindBy(xpath = "//p[contains(text(),'Succeeded')]")
	By BotSendetSucceded = By.xpath("//p[contains(text(),'Succeeded')]");
	
	@FindBy(xpath = "//p[contains(text(),'Session deleted')]")
	By BotSendetSessionDeleted = By.xpath("//p[contains(text(),'Session deleted')]");

	@Given("^Webdriver Started$")
	public void webdriver_Started() {
		DriverUtilities.setpropertys();
	}

	@Given("^Webdriver Properties are loadet$")
	public void webdriver_Properties_are_loadet() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 60 * 3);
	}

	@When("^Webdriverlogger is in LogLevel Level\\.INFO$")
	public void webdriverlogger_is_in_LogLevel_Level_INFO() {
		((RemoteWebDriver) driver).setLogLevel(Level.INFO);
	}

	@Then("^user opens livepersoninc$")
	public void user_opens_livepersoninc() throws MalformedURLException {
		URL url = new URL("https://livepersoninc.github.io/visitor-page/?siteid=70057248");

		URL urlgoogle = new URL("https://www.google.com/");

		driver.get(urlgoogle.toString());
		wait.until(ExpectedConditions.urlToBe(urlgoogle.toString()));

		driver.navigate().to(url.toString());

		wait.until(ExpectedConditions.urlToBe(url.toString()));
	}

	@Then("^user opens LiveChat$")
	public void user_opens_LiveChat() {
		// open the Chatbar:
		System.out.println(ChatopenerButton);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ChatopenerButton));
		driver.findElement(ChatopenerButton).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='lpChat']/div[2]")));
	}

	@Then("^user waits for option Chatmenu$")
	public void user_waits_for_option_Chatmenu() {
		By contactformheader = By.xpath(
				// "//*span[@aria-label='Contact us']"
				"//*[@id=\"lpChat\"]/div[2]/div[1]/div/div[2]/span[1]");
		By kamibotHeader = By.xpath(
				// "//*span[@aria-label='KamilBot']"
				"//*[@id=\"lpChat\"]/div[2]/div[1]/div/div[2]/span[1]");
		
		try {
			if(driver.findElement(contactformheader).getText() == "Contact us") {
				System.out.println("select contact");
				
				//wait.until(ExpectedConditions.visibilityOfElementLocated(contactformheader));
				By cancelbutton = By.xpath("//button[@class='lp_cancel_button lpc_survey-area__cancel-button lpc_desktop']");
				clickchatButton(driver,wait,cancelbutton);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
		try {
			if(driver.findElement(kamibotHeader).getText() == "KamilBot") {
				System.out.println("select KamiBHot");
				//wait.until(ExpectedConditions.visibilityOfElementLocated(kamibotHeader));
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
		// AntwortPC Div Options Men
		wait.until(ExpectedConditions.visibilityOfElementLocated(BotOptionsmenu));
		wait.until(ExpectedConditions.elementToBeClickable(BotOptionsmenu));
	}

	@Then("^user sends Read in Massage Texfield$")
	public void user_sends_Read_in_Massage_Texfield() {
		TypetextAndSend(driver,wait,MtextField, BotComandEnum.READ.toString());
	}

	@Then("^user waits for first Succeeded$")
	public void user_waits_for_first_Succeeded() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(BotSendetSucceded));
		wait.until(ExpectedConditions.elementToBeClickable(BotSendetSucceded));
	}

	@Then("^user sends RESET in Massage Texfield$")
	public void user_sends_RESET_in_Massage_Texfield() throws InterruptedException {
		TypetextAndSend(driver,wait,MtextField, BotComandEnum.RESET.toString());
		Thread.sleep(8000);
	}

	@Then("^user waits for first Session deleted$")
	public void user_waits_for_first_Session_deleted() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(BotSendetSessionDeleted));
		wait.until(ExpectedConditions.elementToBeClickable(BotSendetSessionDeleted));
	}

	@Then("^user sends SQL in Massage Texfield$")
	public void user_sends_SQL_in_Massage_Texfield() throws InterruptedException {
		TypetextAndSend(driver,wait,MtextField, BotComandEnum.SQL.toString());
		Thread.sleep(8000);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, true);
	}

	@After
	public void close_the_driver() {
		System.out.println("Driver Quites");
		DriverUtilities.secureWebDriverClose(driver);
	}

	public static By BYagentType() {
		return By.xpath("//div[@class='lp_lpview_agent_is_typing' and contains(text(),'Agent is typing...') and (contains(@style,'display: block'))]");
	}
	
	public static void Typetext(WebDriver driver,WebDriverWait wait,By MtextField, CharSequence inpt) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(MtextField));
		wait.until(ExpectedConditions.elementToBeClickable(MtextField));
	    driver.findElement(MtextField).click();
	    driver.findElement(MtextField).clear();
	    driver.findElement(MtextField).sendKeys(inpt);
	    wait.until(ExpectedConditions.textToBePresentInElementValue(MtextField, inpt.toString()));
	}
	
	public static void TypetextAndSend(WebDriver driver,WebDriverWait wait,By MtextField, CharSequence inpt) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(MtextField));
		wait.until(ExpectedConditions.elementToBeClickable(MtextField));
	    driver.findElement(MtextField).click();
	    driver.findElement(MtextField).clear();
	    driver.findElement(MtextField).sendKeys(inpt);
	    wait.until(ExpectedConditions.textToBePresentInElementValue(MtextField, inpt.toString()));
	    driver.findElement(MtextField).sendKeys(Keys.ENTER);
	}
	
	public static void clickchatButton(WebDriver driver,WebDriverWait wait,By BYchatButton) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(BYchatButton));
		wait.until(ExpectedConditions.elementToBeClickable(BYchatButton));
		driver.findElement(BYchatButton).click();
	}
	
}
