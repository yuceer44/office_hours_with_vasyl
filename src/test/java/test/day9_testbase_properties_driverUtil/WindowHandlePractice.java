package test.day9_testbase_properties_driverUtil;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.base.TestBase;

import java.util.Set;

public class WindowHandlePractice extends TestBase {

    @Test
    public void multiple_window_test(){

        driver.get("https://www.amazon.com");

        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);


        // we are downcasting our driver to JavascriptExecutor to be able to use its methods.
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        //5. Create a logic to switch to the tab where Etsy.com is open
        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {

            driver.switchTo().window(each);
            System.out.println("current title:" + driver.getTitle());

            if (driver.getCurrentUrl().contains("etsy")){
                // 6. Assert: Title contains “Etsy”
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }

        }





    }

}
