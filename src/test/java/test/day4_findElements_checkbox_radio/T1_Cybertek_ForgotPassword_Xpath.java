package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T1_Cybertek_ForgotPassword_Xpath {
    public static void main(String[] args) {
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        //a. “Home” link
        //tagName[@attribute='value']
            //a[@class='nav-link']
            //a[@href='/']
        //tagName[.='text']
            //a[.='Home']
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
        //b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
        //label[.='E-mail']

        //d. E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

        //e. “Retrieve password” button
        WebElement retrieveButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cybertek School” text
        WebElement footerText = driver.findElement(By.xpath("//a[.='Cybertek School']/.."));

        //4. Verify all WebElements are displayed.
        if(homeLink.isDisplayed() && forgotPasswordHeader.isDisplayed()
        && emailLabel.isDisplayed() && emailInput.isDisplayed()
        && retrieveButton.isDisplayed() && footerText.isDisplayed()){
            System.out.println("All of the webElements are displayed. PASS!");
        }else{
            System.out.println("One or more of the web elements are not displayed. FAIL!");
        }

    }
}
