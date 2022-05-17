package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddEmployeePage extends PageObject {

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimButton;

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addPimButton;

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "firstName")
    WebElement firstnameField;

    @FindBy(id = "middleName")
    WebElement middlenameField;

    @FindBy(id = "lastName")
    WebElement lastnameField;

    @FindBy(id = "employeeId")
    WebElement employeeIdField;

    @Step
    public void clickPimButton() {
        pimButton.click();
    }

    @Step
    public void clickAddPimButton(){
        addPimButton.click();
//        addButton.click();
//        waitForRenderedElementsToBePresent((By) addPimButton);
//        addPimButton.waitUntilVisible().click();

    }
    public void enterFirtname(){
        firstnameField.sendKeys("awal");
    }
    public void enterMiddlename(){
        middlenameField.sendKeys("tengah");
    }
    public void enterLastname(){
        lastnameField.sendKeys("akhir");
    }
    public void enterEmployeeId(){
        employeeIdField.clear();
    }


}
