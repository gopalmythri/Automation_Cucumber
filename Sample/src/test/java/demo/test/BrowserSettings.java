package demo.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import static userdata.URLData.*;



public class BrowserSettings {
public WebDriver BrowserSettings() {
		
		WebdriverSettings wds = new WebdriverSettings();//driver detais
		WebDriver driver = wds.driverSettings();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(BASE_URL);
		return driver;
	}

}
