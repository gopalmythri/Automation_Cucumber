package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelenuimUtils {
	
	

    public WebDriver _driver;
    
   
	public SelenuimUtils(WebDriver _driver) {
		super();
		this._driver = _driver;
	}

	public void click(By selector) {
        WebElement element = _driver.findElement(selector);
        try {
            element.click();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    
        public void sendKeys(By selector, String value) {
            WebElement element =  _driver.findElement(selector);
            element.clear();
                try {
					element.sendKeys(value);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
           
        }
        
        public void JavaScriptExecuter(By selector) {
        	JavascriptExecutor js= (JavascriptExecutor) _driver;  // java script executor  		
            js.executeScript("arguments[0].scrollIntoView();", selector);
        }
}
