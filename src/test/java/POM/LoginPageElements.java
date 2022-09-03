package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPageElements extends BasePOM{

    public LoginPageElements(){PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//li[@class='authorization-link']//a")
    private WebElement signInButton;

    @FindBy(css = "input[id='email']")
    private WebElement emailInput;

    @FindBy(css = "input[id='pass']")
    private WebElement passwordInput;

    @FindBy(css = "button[id='send2']")
    private WebElement loginSignButton;

    @FindBy(css = "span[class='logged-in']")
    private WebElement loggedInHeader;

    @FindBy(css = "button[class='action switch']")
    private WebElement myAccountDropdown;

    @FindBy(xpath = "//a[text()='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    private WebElement manageAddressButton;


    public void validateUserOnLoginPage(){
        Assert.assertTrue(signInButton.isDisplayed());

    }

    public void userLoginWebsite(String username, String password){
        signInButton.click();
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginSignButton.click();

    }

    public void validateUserSuccessfullyLoggedIn(){
        wait.until(ExpectedConditions.visibilityOf(loggedInHeader));
        Assert.assertTrue(loggedInHeader.isDisplayed());

    }

    public void userNavigateManageAccountPage (){
        myAccountDropdown.click();
        myAccountButton.click();
        manageAddressButton.click();
    }

}
