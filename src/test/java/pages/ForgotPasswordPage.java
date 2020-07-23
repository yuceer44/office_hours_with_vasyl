package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ForgotPasswordPage {

    public ForgotPasswordPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //input box
    @FindBy(id = "prependedInput")
    public WebElement inputBox;

    //request button
    @FindBy(xpath = "//button[.='Request']")
    public WebElement requestButton;

    //error message
    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;



}
