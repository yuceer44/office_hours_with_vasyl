package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class StaleElementExplanation2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        //Locating gmail link from top right corner
        WebElement gmailLink = driver.findElement(By.xpath("//a[.='Gmail']"));

        //clicking to the link
        gmailLink.click();

        driver.navigate().back();

        gmailLink = driver.findElement(By.xpath("//a[.='Gmail']"));
        gmailLink.click();



    }
}
