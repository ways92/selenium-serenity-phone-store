package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends PageObject {


    @FindBy(id = "login2")
    WebElement loginMenu;

    @FindBy(id = "loginusername")
    WebElement usernameField;

    @FindBy(id = "loginpassword")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @FindBy(id = "nameofuser")
    WebElement myUsername;

//    @FindBy(id = "logout2")
//    WebElement logoutButton;
//
//    @FindBy(xpath = "//a[@id='cartur']")
//    WebElement cardButton;
//
//    @FindBy(xpath = "//a[contains(text(),'Laptops')]")
//    WebElement laptopsMenu;



    @Step
    public void clearCookie(){
        getDriver().manage().deleteAllCookies();
    }
    @Step
    public void clickMenuLogin(){
        loginMenu.click();
    }

    @Step
    public void enterValidUsername(){
        usernameField.sendKeys("ways@gmail.com");

    }

    @Step
    public void enterValidPassword(){
        passwordField.sendKeys("makanayam");
    }

    @Step
    public void clickLoginInForm(){
        waitForElement().until(ExpectedConditions.elementToBeClickable(loginButton)).click();

    }

    @Step
    public boolean validateLogin()   {
         return waitForElement().until(ExpectedConditions.visibilityOf(myUsername)).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        usernameField.sendKeys(username);
    }
    @Step
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }

    @Step
    public void validateScenarioLogin(String result) throws InterruptedException {
        if (result.equals("dashboard")){
            try {
                waitForElement().until(ExpectedConditions.visibilityOf(myUsername)).isDisplayed();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }else {

            waitForCondition().until(ExpectedConditions.alertIsPresent());
            Alert modalAlert = getDriver().switchTo().alert();
            String textAlert = modalAlert.getText();

            System.out.println(textAlert);
            if (result.equals("error")){
                Assert.assertEquals(textAlert, "Please fill out Username and Password.");

            }
            if (result.equals("not exist")){
                Assert.assertEquals(textAlert, "User does not exist.");

            }
            if (result.equals("wrong pass")){
                Assert.assertEquals(textAlert, "Wrong password.");

            }
           else {
                System.out.println("error login.....");
            }

            modalAlert.accept();
        }


    }

    @Step
    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", "");
    }






//    @Step
//    public void clickLaptopsSideMenu(){
//        laptopsMenu.click();
//    }
//    @Step
//    public void clickCartMenu(){
//        cardButton.click();
//    }
//
//


}
