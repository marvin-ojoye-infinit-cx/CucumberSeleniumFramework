package cx.infinit.selenium.InfinitBotTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	public static void main(String[] args) throws Exception {
		DriverUtilities.setpropertys();
		WebDriver driver = new ChromeDriver();
		try {
			// tries to open chercher.tech page
			driver.get("https://livepersoninc.github.io/visitor-page/?siteid=70057248");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@class = 'LPMcontainer LPMoverlay']")).click();
			// WebElement message =
			// driver.findElement(By.xpath("//textarea[@class='lpview_form_textarea
			// lpc_composer__text-area lpc_desktop lp_expandable_textarea lp_ltr']"));
			WebElement message = driver
					.findElement(By.xpath("//div[@class='lp_input_area lpc_composer__text-area-wrapper lpc_desktop']"));
			Thread.sleep(5000);
			// message.click();

			message.clear();
			message.sendKeys(new String[] { "read" });
			driver.findElement(By.xpath("//button[@class='lp_send_button lpc_composer__send-button lpc_desktop']"))
					.click();
			// driver.findElement(By.xpath("//div[@class='lp_bottom_area']")).click();
		} finally {
			DriverUtilities.secureWebDriverClose(driver);
		}

	}

}
