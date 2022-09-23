package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleautomation {

public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C://Users//chromedriver.exe");
	 WebDriver driver= new ChromeDriver();  
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.get("https://www.amazon.in/");   //passing the url using the get method
	 driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();  //clicking on login button
	 driver.findElement(By.id("ap_email")).sendKeys("8522998308");   //passing the username 
	 driver.findElement(By.id("continue")).click(); //clicking on continue button
	 driver.findElement(By.id("ap_password")).sendKeys("Pram0d@1991"); //sending passord to text box
	 driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@id='signInSubmit']")).click(); //click on submit button
	 
	 //driver.findElement(By.id("searchDropdownBox")).click();
	 //Select select= new Select(driver.findElement(By.id("searchDropdownBox")));
	 //select.selectByValue("search-alias=electronics-intl-ship");
	
	
	driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click(); //clicking on ALL Menu
	driver.findElement(By.xpath("(//a[@class='hmenu-item']/div)[1]")).click(); //click on items 
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[@class='hmenu-item'])[1]")).click(); //selecting item
	JavascriptExecutor js= (JavascriptExecutor) driver;  // java script executor  
	WebElement Element = driver.findElement(By.xpath("//div[@id='newAccordionCaption_feature_div']"));//scrolling to add button view 

    // Scrolling down the page till the element is found		
    js.executeScript("arguments[0].scrollIntoView();", Element);
	driver.findElement(By.xpath("//span[@id='mbc-buybutton-addtocart-1']")).click(); //click on add button 
	driver.findElement(By.xpath("(//span[@class='a-button-inner']//input[@type='submit'])[5]")).click(); //click on view cart button
	Thread.sleep(500000);
	driver.close();
	 
}
}
