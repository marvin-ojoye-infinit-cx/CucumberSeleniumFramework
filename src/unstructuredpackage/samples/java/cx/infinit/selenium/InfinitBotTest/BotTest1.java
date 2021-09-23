package cx.infinit.selenium.InfinitBotTest;

import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BotTest1 {
	public static void main(String[] args)
	{
		DriverUtilities.setpropertys();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60*3);
		
		((RemoteWebDriver) driver).setLogLevel(Level.INFO);

		try {
		
		driver.manage().deleteAllCookies(); 
			
		//open webpage
			
		URL url = new URL("https://livepersoninc.github.io/visitor-page/?siteid=70057248");
			
		URL urlgoogle = new URL("https://www.google.com/");
		
		driver.get(urlgoogle.toString());
		wait.until(ExpectedConditions.urlToBe(urlgoogle.toString()));
		
		driver.navigate().to(url.toString());
		
		wait.until(ExpectedConditions.urlToBe(url.toString()));
		
		
		//open the Chatbar:
		By ChatopenerButton = By.cssSelector(".LPMoverlay");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ChatopenerButton));
		driver.findElement(ChatopenerButton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='lpChat']/div[2]")));
		By contactformheader = By.xpath(
				//"//*span[@aria-label='Contact us']"
				"//*[@id=\"lpChat\"]/div[2]/div[1]/div/div[2]/span[1]"
				);
		By kamibotHeader = By.xpath(
				//"//*span[@aria-label='KamilBot']"
				"//*[@id=\"lpChat\"]/div[2]/div[1]/div/div[2]/span[1]"
				);
		
		
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
		
		
		By MtextField = By.xpath("//div[@id='LP_ChatViewController_1']/div[2]/div/textarea");
		
	    // Chat sendbutton
	    By SendButton = By.xpath("//button[@class='lp_send_button lpc_composer__send-button lpc_desktop']");
	    /*
	    Typetext(wait,MtextField,BotComandEnumx.RESET.toString());
	    clickchatButton(wait,SendButton);
		
		/* wait div Agent is typing...
		By agent_is_typing = BYagentType();
		wait.until(ExpectedConditions.visibilityOfElementLocated(agent_is_typing));
		*/
		
	    // AntwortPC Div Options Men
		By reflectPCmassageElem = By.xpath("//p[contains(text(),'OPTIONS:')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(reflectPCmassageElem));
		int elemsize = driver.findElements(reflectPCmassageElem).size();
		System.out.printf("Element %s = size %d%n",reflectPCmassageElem,elemsize);
		wait.until(ExpectedConditions.elementToBeClickable(reflectPCmassageElem));
		
		TypetextAndSend(driver,wait,MtextField, BotComandEnum.READ.toString());
		
		// wait div Agent is typing...
		//wait.until(ExpectedConditions.visibilityOfElementLocated(BYagentType()));
		
		By reflectPCmassageElemsu = By.xpath("//p[contains(text(),'Succeeded')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(reflectPCmassageElemsu));
		wait.until(ExpectedConditions.elementToBeClickable(reflectPCmassageElemsu));
		
		int reflectPCmassageElemCount = driver.findElements(reflectPCmassageElemsu).size();
	    
	    TypetextAndSend(driver,wait,MtextField, BotComandEnum.RESET.toString());
		
	    Thread.sleep(8000);
    	// wait div Agent is typing...
 		//wait.until(ExpectedConditions.visibilityOfElementLocated(BYagentType()));
	    
		TypetextAndSend(driver,wait,MtextField, BotComandEnum.SQL.toString());
	    
		Thread.sleep(8000);
		
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
		
		int elemsize2 = driver.findElements(reflectPCmassageElem).size();
		System.out.printf("Element %s = size1 %d sizelast %d %n",reflectPCmassageElem,elemsize,elemsize2);
		
		System.out.printf("Element %s = size1 %d sizelast %d %n",reflectPCmassageElemsu,reflectPCmassageElemCount,driver.findElements(reflectPCmassageElemsu).size());
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Press any key and enter to stop the Driver");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("You enterd: " + userName);
	    System.out.println("Webdriver stops");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DriverUtilities.secureWebDriverClose(driver);
		}
	}
	// getDriver().findElement(By.xpath("//*[@class='message']/..//*[contains(text(),'" + contractID + "')]"));
	
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
