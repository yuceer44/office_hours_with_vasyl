package test.day3_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class AbsoluteXpathPractice {

    public static void main(String[] args) {

        //Go to http://practice.cybertekschool.com/multiple_buttons
        //Verify "Home" link is displayed on the page

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement homeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        if (homeLink.isDisplayed()){
            System.out.println("Home link is displayed on the page. PASS!");
        }else{
            System.out.println("Home link is NOT displayed on the page. FAIL!");
        }

    }

}
