package demo.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import demo.Objects;
import demo.SelenuimUtils;
import userdata.UserData;

public class AddCartAmoazonShoping {

	Objects obj = new Objects();

	@Test
	public void AddItemtoCart() throws InterruptedException {
		BrowserSettings bs = new BrowserSettings();
		WebDriver driver = bs.BrowserSettings();
		Login(driver);
		addtoCart(driver);

	}

	private void Login(WebDriver driver) {
		SelenuimUtils utils = new SelenuimUtils(driver);
		utils.click(obj.login_button);
		utils.sendKeys(obj.username, UserData.USER_EMAIL);
		utils.click(obj.contnue_button);
		utils.sendKeys(obj.pwd, UserData.USER_PASSWORD);
		utils.click(obj.submit_button);

	}

	public void addtoCart(WebDriver driver) throws InterruptedException {
		SelenuimUtils utils = new SelenuimUtils(driver);
		utils.click(obj.all_menu);
		utils.click(obj.click_on_items);
		Thread.sleep(10000);
		utils.click(obj.selecting_item);
		utils.click(obj.AddtoCart_button);
		utils.click(obj.click_on_view_cart_button);
		Thread.sleep(5000);
		driver.close();
	}
}
