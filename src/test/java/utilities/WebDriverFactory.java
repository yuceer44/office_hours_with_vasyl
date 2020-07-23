package utilities;
//	Task :
//	- Write a static method in WebDriverFactory class
//	- Return type is WebDriver
//	- method name getDriver
//	- it accepts one String argument, and returns the browser according to what string is passed
//	- if "chrome" --> returns chrome browser
//	- if "firefox" --> returns firefox browser

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

   public static WebDriver getDriver(String browserType){

       if(browserType.equalsIgnoreCase("chrome")){
           WebDriverManager.chromedriver().setup();
           return new ChromeDriver();
       }else if (browserType.equalsIgnoreCase("firefox")){
           WebDriverManager.firefoxdriver().setup();
           return new FirefoxDriver();
       }else{
           System.out.println("Given browser type does not exist. Driver = null!");
           return null;
       }

   }


}
