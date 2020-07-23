package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class P04_Cybertek_Checkboxes {

    public static void main(String[] args) throws InterruptedException{
        //Practice: Cybertek Checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        if (!checkbox1.isSelected()){
            System.out.println("Checkbox 1 is not selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 1 is selected. Verification FAILED!");
        }

        //3. Confirm checkbox #2 is SELECTED by default.

        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        if(checkbox2.isSelected()){
            System.out.println("Checkbox 2 is selected by default. Verification PASSED!");
        }else{
            System.out.println("Checkbox 2 is NOT selected by default. Verification FAILED!");
        }

        //4. Click checkbox #1 to select it.
        Thread.sleep(1000);
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(1000);
        checkbox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        if (checkbox1.isSelected()){
            System.out.println("Checkbox 1 is selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 1 is NOT selected. Verification FAILED!");
        }


        //7. Confirm checkbox #2 is NOT selected.

        if(!checkbox2.isSelected()){
            System.out.println("Checkbox 2 is NOT selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 2 is selected . Verification FAILED!");
        }
    }
}
