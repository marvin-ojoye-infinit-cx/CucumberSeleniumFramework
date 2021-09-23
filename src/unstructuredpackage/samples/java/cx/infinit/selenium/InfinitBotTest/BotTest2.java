package cx.infinit.selenium.InfinitBotTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BotTest2 {
	static String url;
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		DriverUtilities.setpropertys();
		//WebDriver driver=new ChromeDriver();
		
		//hub properties
		url = "http://192.168.0.101:19705/wd/hub";
		//19705
		//new DesiredCapabilities();
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(url), dc);
		
		try {
		
		//URL traversal
		driver.get("https://livepersoninc.github.io/visitor-page/?siteid=70057248");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class = 'LPMcontainer LPMoverlay']")).click();
	    
		Thread.sleep(8000);
	    driver.findElement(By.xpath("//div[@id='LP_ChatViewController_1']/div[2]/div/textarea")).click();
	    driver.findElement(By.xpath("//div[@id='LP_ChatViewController_1']/div[2]/div/textarea")).clear();
	    driver.findElement(By.xpath("//div[@id='LP_ChatViewController_1']/div[2]/div/textarea")).sendKeys(new String[]{"read"});
	    
	    driver.findElement(By.xpath("//button[@class='lp_send_button lpc_composer__send-button lpc_desktop']")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DriverUtilities.secureWebDriverClose(driver);
		}
	}

}
