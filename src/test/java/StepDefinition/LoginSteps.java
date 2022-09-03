package StepDefinition;

import POM.LoginPageElements;
import io.cucumber.java.en.*;

public class LoginSteps {

    LoginPageElements loginPageElements;

    @Given("User navigate to website")
    public void user_navigate_to_website() {
        loginPageElements = new LoginPageElements();
        loginPageElements.validateUserOnLoginPage();
    }

    @When("User enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
        loginPageElements = new LoginPageElements();
        loginPageElements.userLoginWebsite(username, password);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        loginPageElements = new LoginPageElements();
        loginPageElements.validateUserSuccessfullyLoggedIn();

    }

}
