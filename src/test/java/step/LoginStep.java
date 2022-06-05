package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginPage;


    @Given("User on login page")
    public void adminOnPage() {
        loginPage.clearCookie();
        loginPage.open();
    }

    @When("click log in on menu")
    public void clickLogInOnMenu() {
        loginPage.clickMenuLogin();
    }

    @When("User fill username and password")
    public void userFillUsernameAndPassword() {
        loginPage.enterValidUsername();
        loginPage.enterValidPassword();
    }

    @When("User click on login button to submit")
    public void userClickOnLoginButtonToSubmit() {
        loginPage.clickLoginInForm();
    }

    @Then("Validate on dashboard")
    public void validateOnDashboard() throws Throwable {
        Thread.sleep(2000);
        loginPage.validateLogin();
    }

    @When("^User enter username (.*)$")
    public void userEnterUsername(String username) {
        loginPage.inputUsername(username);
    }

    @When("^User enter password (.*)$")
    public void userEnterPassword(String password) {
        loginPage.inputPassword(password);
    }

    @Then("^Validate on login page (.*)$")
    public void validateOnDashboardResult(String result) throws InterruptedException{
        Thread.sleep(2000);
        loginPage.validateScenarioLogin(result);
    }


}
