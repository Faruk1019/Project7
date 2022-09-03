package StepDefinition;

import POM.LoginPageElements;
import POM.ManageAddressPageElements;
import io.cucumber.java.en.*;

public class AddNewAddressSteps {

    LoginPageElements loginPageElements;
    ManageAddressPageElements manageAddressPageElements;

    @Then("User navigate to Manage Account page")
    public void user_navigate_to_manage_account_page() {

        manageAddressPageElements = new ManageAddressPageElements();
        loginPageElements = new LoginPageElements();

        loginPageElements.userNavigateManageAccountPage();
    }

    @When("User create {string} {string} {string} {string} {string}")
    public void user_create(String Address, String City, String State, String Zipcode, String Country) {

        manageAddressPageElements = new ManageAddressPageElements();
        loginPageElements = new LoginPageElements();

        manageAddressPageElements.addNewAddress(Address, City, State, Zipcode, Country);

    }

    @Then("Add new address success message should be displayed")
    public void add_new_address_success_message_should_be_displayed() {
        manageAddressPageElements = new ManageAddressPageElements();
        loginPageElements = new LoginPageElements();

        manageAddressPageElements.validateUserSuccessfullyAddedAddress();
    }


}
