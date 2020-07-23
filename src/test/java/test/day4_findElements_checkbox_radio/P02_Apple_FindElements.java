package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P02_Apple_FindElements {

    public static void main(String[] args) {
        //TC #02: FINDELEMENTS_APPLE
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");

        //3. Click to iPhone
        //locating the iphone link with xpath
        WebElement iphoneLink = driver.findElement(By.xpath("//span[.='iPhone']/.."));
        //clicking to the iphone link we just located

        //Thread.sleep(2000);
        iphoneLink.click();

        //4. Print out the texts of all links
        //we need to locate all of the links on the page
        //body//a --> will return all of the links INSIDE OF <body>
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement link : allLinks){

            String textOfLinks = link.getText();
            System.out.println(textOfLinks);

            if(textOfLinks.isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }

        }

        //5. Print out how many link is missing text
        System.out.println("Number of links without texts ===> " + linksWithoutText);

        //6. Print out how many link has text
        System.out.println("Number of links with texts ===>" + linksWithText);

        //7. Print out how many total link
        System.out.println("Number of TOTAL LINKS ===> " + allLinks.size());


    }

}
