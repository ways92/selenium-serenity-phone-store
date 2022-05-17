package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.apache.pdfbox.pdmodel.interactive.form.PDPushButton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

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
    WebElement textUsername;

    @FindBy(id = "logout2")
    WebElement logoutButton;

    @FindBy(xpath = "//a[@id='cartur']")
    WebElement cardButton;

    @FindBy(xpath = "//a[contains(text(),'Laptops')]")
    WebElement laptopsMenu;

    @FindBy(id = "spanMessage")
    WebElement errorMessage;



    @Step
    public void clickMenuLogin(){
        loginMenu.click();
    }

    @Step
    public void enterValidUsername(){
        waitForElement().until(ExpectedConditions.visibilityOf(usernameField)).sendKeys("ways@gmail.com");
//        usernameField.sendKeys("ways@gmail.com");

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
    public void validateLogin()   {
//        waitForElement().until(ExpectedConditions.visibilityOf(logoutButton)).waitUntilVisible();

//        waitForElement().until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
//        logoutButton.click();
//        return textUsername.isDisplayed();
//        cardButton.click();

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", "");

    }

    @Step
    public void clickLaptopsMenu(){
        laptopsMenu.click();
    }
    @Step
    public void clickCartMenu(){
        cardButton.click();
    }

    public void validateTextUsername(){
        textUsername.isDisplayed();
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
    public boolean errorMessageAppear(){
        return errorMessage.isDisplayed();
    }

}
