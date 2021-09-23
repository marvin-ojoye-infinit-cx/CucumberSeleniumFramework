package cx.infinit.selenium.InfinitBotTest;

import java.net.URL;
import java.util.PropertyResourceBundle;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class DriverUtilities {
	
	public static void setpropertys() {
		
		
		PropertyResourceBundle bundle = (PropertyResourceBundle) PropertyResourceBundle.getBundle("test");

		for (Object key : bundle.keySet()) {
			System.getProperties().put(key.toString(), bundle.getString(key.toString()));

			System.out.println(key.toString() + " " + bundle.getString(key.toString()));
		}
		
		// String username = System.getProperty("test.hub.user");
		
		URL resourcepath = DriverUtilities.class.getClassLoader().getResource("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", resourcepath.getPath().toString());
	}

	public static boolean isAlive(WebDriver driver) {
		try {
			return driver.getWindowHandles().size() > 0;
		} catch (UnhandledAlertException ex) {
			return true;
		} catch (WebDriverException ex) {
			return false;
		}
	}

	public static void secureWebDriverClose(WebDriver driver) {
		if (isAlive(driver) == true) {
			driver.quit();
		} else {
			driver.close();
		}
	}

}
