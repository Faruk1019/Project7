package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ManageAddressPageElements extends BasePOM{

    public ManageAddressPageElements(){PageFactory.initElements(driver, this);}

    @FindBy(css = "input[id='street_1']")
    private WebElement inputStreetAddress;

    @FindBy(css = "input[id='city']")
    private WebElement inputCity;

    @FindBy(css = "select[id='region_id']")
    private WebElement stateDropdown;

    @FindBy(css = "input[id='zip']")
    private WebElement inputZipCode;

    @FindBy(css = "select[id='country']")
    private WebElement countryDropdown;

    @FindBy(css = "input[id='telephone']")
    private WebElement inputPhoneNumber;

    @FindBy(css = "button[role='add-address']")
    private WebElement addNewAddressButton;

    @FindBy(css = "button[title='Save Address']")
    private WebElement saveButton;

    @FindBy(css = "div[role='alert']")
    private WebElement addNewAddressSuccessMsg;

    private String phoneNumber = "5553334444";


    public void addNewAddress(String Address, String City, String State, String ZipCode, String Country) {

        addNewAddressButton.click();
        inputStreetAddress.sendKeys(Address);
        inputCity.sendKeys(City);
        Select selectState = new Select(stateDropdown);
        selectState.selectByVisibleText(State);
        inputZipCode.sendKeys(ZipCode);
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText(Country);
        inputPhoneNumber.sendKeys(phoneNumber);
        saveButton.click();
    }

    public void validateUserSuccessfullyAddedAddress(){
        wait.until(ExpectedConditions.visibilityOf(addNewAddressSuccessMsg));
        Assert.assertTrue(addNewAddressSuccessMsg.isDisplayed());

    }


}
