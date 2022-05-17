package step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page.AddEmployeePage;

public class AddEmployeeStep {

    @Steps
    AddEmployeePage addEmployeePagePage;

    @When("Click PIM on menu")
    public void clickPIMOnMenu() {
        addEmployeePagePage.clickPimButton();
    }

    @When("Click Add Employee on submenu")
    public void clickAddEmployeeOnSubmenu() {
        addEmployeePagePage.clickAddPimButton();
    }

    @When("Enter first name, middle name, last name, employee id")
    public void enterFirstNameMiddleNameLastNameEmployeeId() {
        addEmployeePagePage.enterFirtname();
        addEmployeePagePage.enterMiddlename();
        addEmployeePagePage.enterLastname();
        addEmployeePagePage.enterEmployeeId();
    }

    @When("Click save")
    public void clickSave() {
    }

    @Then("User get new employee")
    public void userGetNewEmployee() {
    }
}
