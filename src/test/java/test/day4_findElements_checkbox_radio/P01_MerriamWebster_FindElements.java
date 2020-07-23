package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P01_MerriamWebster_FindElements {
    public static void main(String[] args) {
        //TC #0: FINDELEMENTS
        //1. Open Chrome browser
        //2. Go to https://www.merriam-webster.com/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Implicit wait will wait UPTO given seconds.
        //If page is loaded before it will continue.
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.merriam-webster.com");

        //3. Print out the texts of all links
        // we are creating a List of WebElements and storing values returned
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        //option + enter to import in Mac
        //alt + enter for Windows

        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement eachLink : listOfLinks) {
            //System.out.println(eachLink.getText());
            String textOfEachLink = eachLink.getText();


            if (textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else{
                System.out.println(textOfEachLink);
                linksWithText++;
            }

        }
        //4. Print out how many link is missing text
        System.out.println("The number of links that does NOT have text: " + linksWithoutText);

        //5. Print out how many link has text
        System.out.println("The number of links that have text: " + linksWithText);

        //6. Print out how many total link
        System.out.println("Total links on this page: " + listOfLinks.size());
    }
}
