package test.day6_testng_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Dropdowns_Intro {

    WebDriver driver;

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @BeforeMethod
    public void setUp(){

        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    /*
    This method is testing default value verification for ....
     */


    @Test
    public void test1_default_value_verification(){

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String actualDefaultOfSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedDefaultOfSimpleDropdown = "Please select an option";

        Assert.assertEquals(actualDefaultOfSimpleDropdown, expectedDefaultOfSimpleDropdown);

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualDefaultOfStateDropdown = stateDropdown.getFirstSelectedOption().getText();
        String expectDefaultOfStateDropdown = "Select a State";

        Assert.assertEquals(actualDefaultOfStateDropdown, expectDefaultOfStateDropdown);

    }

    @Test
    public void test2_state_dropdown_verification() throws InterruptedException{
        //TC #2: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        //FIRST TWO STEPS ARE IMPLEMENTED IN BEFOREMETHOD

        //locating state dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        //Selecting using .selectByValue(); method --> Expected the attribute value of "value" attribute.
        Thread.sleep(1000);
        stateDropdown.selectByValue("IL");

        //4. Select Virginia
        //Selecting using selectByVisibleText(); method --> Expects us to pass the actual displayed text.
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Virginia");

        //5. Select California
        //Selecting using selectByIndex(); method --> Expects us to pass the index number of the option.

        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.

        String expectedOption = "California";
        String actualSelectedOption = stateDropdown.getFirstSelectedOption().getText();

        //Assert.assertEquals(actualSelectedOption, expectedOption);

        Assert.assertTrue(actualSelectedOption.equals(expectedOption));

        //Use all Select options. (visible text, value, index)
    }

}
