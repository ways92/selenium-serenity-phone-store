package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page.AddEmployeePage;
import page.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginPage;


    @Given("User on login page")
    public void adminOnPage() {
        loginPage.open();
    }

    @When("click log in on menu")
    public void clickLogInOnMenu() {
        loginPage.clickMenuLogin();
    }

    @When("User enter username and password")
    public void userEnterUsernameAndPassword()  {
        loginPage.enterValidUsername();
        loginPage.enterValidPassword();
    }

    @When("User click on login button to submit")
    public void userClickOnLoginButtonToSubmit() {
        loginPage.clickLoginInForm();
    }


    @Then("Validate on dashboard")
    public void validateOnDashboard() throws Throwable {
//        loginPage.validateLogin();
//        Thread.sleep(3000);
//        loginPage.clickLaptopsMenu();
//        Thread.sleep(3000);
//        loginPage.clickCartMenu();
        Thread.sleep(3000);
        loginPage.validateTextUsername();
        Thread.sleep(3000);

    }






    @Then("User see quick launch panel on dashboard")
    public void userSeeQuickLaunchPanelOnDashboard() {
        loginPage.validateLogin();
    }

    @When("User enter username and password {string} {string}")
    public void userEnterUsernameAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @Then("User see result {string}")
    public void userSeeResult(String result) {
        if(result.equals("quick launch panel")){
            loginPage.validateLogin();
        }else {
            loginPage.errorMessageAppear();
        }
    }



}
