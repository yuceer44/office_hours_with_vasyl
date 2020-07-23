package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class T5_Apple_FindElements_List {

    public static void main(String[] args) throws InterruptedException {
        //TC #03: FINDELEMENTS_APPLE
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");

        //Creating counters: emptyLinks, and links with text
        int emptyLinkCounter = 0;
        int linksWithText = 0;

        Thread.sleep(500);
        //3. Click to all of the headers one by one
        //a. Mac, iPad, iPhone, Watch, TV, Music, Support

        //Creating List of WebElements to store all the links in the header list.
        List<WebElement> appleHeader = driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));

        //The loop where we specify where to start from and where to end in appleHeader List.
        for (int i = 1; i < 8; i++) {

            appleHeader.get(i).click();
            Thread.sleep(1000);
            List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
            //4. Print out how many links on each page with the titles of the pages
            System.out.println("Number of links on page: " + driver.getTitle() + " " + listOfLinks.size());
            //texts of links
            //5. Loop through all
            //6. Print out how many link is missing text TOTAL
            //7. Print out how many link has text TOTAL
            //8. Print out how many total link TOTAL
            for (WebElement link : listOfLinks) {
                String textOfLink = link.getText();
                if (!textOfLink.isEmpty()) {
                    //System.out.println(textOfLink);
                    linksWithText++;
                } else {
                    emptyLinkCounter++;
                }
            }
            driver.navigate().back();
            appleHeader = driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));
        }
        System.out.println("Number of EmptyLinks: \t" + emptyLinkCounter);
        System.out.println("Number of Links with text: \t" + linksWithText);
    }
}
