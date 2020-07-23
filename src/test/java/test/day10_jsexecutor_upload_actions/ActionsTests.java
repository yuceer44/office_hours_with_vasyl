package test.day10_jsexecutor_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class ActionsTests {

    @Test
    public void hover_over_test1() throws InterruptedException{
        Driver.getDriver().get("https://www.amazon.com");

        //1- Create the instance of Actions class
        //2- Pass the current driver instance
        Actions actions = new Actions(Driver.getDriver());

        //3- Locate the web element to hover over
        WebElement languageOptions = Driver.getDriver().findElement(By.id("icp-nav-flyout"));

        Thread.sleep(3000);

        //4- Using actions, hover over to the Language options
        actions.moveToElement(languageOptions).perform();
        //actions.perform();

    }

    @Test
    public void tc15_hover_test() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //We need to locate images and texts

        WebElement img1 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        //We need to create instance of Actions
        //Use the instance to do hovering
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed());

        Thread.sleep(1000);

        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());

        Thread.sleep(1000);

        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());



    }



}
