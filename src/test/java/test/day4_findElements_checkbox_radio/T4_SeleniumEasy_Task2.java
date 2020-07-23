package test.day4_findElements_checkbox_radio;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class T4_SeleniumEasy_Task2 {
    public static void main(String[] args) {
        //TC #3: SeleniumEasy Checkbox Verification – Section 2
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        //3. Verify “Check All” button text is “Check All”
        WebElement checkAllButton = driver.findElement(By.xpath("//input[@id='check1']"));
        String actualText = checkAllButton.getAttribute("value");
        String expectedText = "Check All";

        if (actualText.equals(expectedText)){
            System.out.println("Button text verification passed!");
        }else{
            System.out.println("Button text verification failed!!!");
        }
        //4. Click to “Check All” button
        checkAllButton.click();

        //5. Verify all check boxes are checked
        List<WebElement> checkboxList = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement checkbox : checkboxList){
            if (checkbox.isSelected()){
                System.out.println("Checkbox is selected. PASS!");
            }else{
                System.out.println("Checkbox is NOT selected. FAIL!");
            }
        }

        //6. Verify button text changed to “Uncheck All”
        String actualButtonTextAfterClick = checkAllButton.getAttribute("value");
        String expectedValueAfterClick = "Uncheck All";

        if (actualButtonTextAfterClick.equals(expectedValueAfterClick)){
            System.out.println("Final verification PASSED!");
        }else{
            System.out.println("Final verification FAILED!!!");
        }
    }
}
