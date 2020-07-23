package test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void iframe_practice_test(){

        //1-Locating iframe as web element, then switching to it.
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //WebElement iframe2 = driver.findElement(By.tagName("iframe"));

        //switching to iframe using webElement
        //driver.switchTo().frame(iframe);

        //switching to iframe using indexes
        //driver.switchTo().frame(0);

        //switching to iframe using id or name attribute value
        driver.switchTo().frame("mce_0_ifr");

        //4. Assert: “Your content goes here.” Text is displayed.
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //WE HAVE TO SWITCH BACK TO DEFAULT HTML TO BE ABLE TO LOCATE ANYTHING IN THERE
        driver.switchTo().parentFrame();


        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        WebElement h3Text = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(h3Text.isDisplayed());

    }

}
