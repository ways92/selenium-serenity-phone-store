package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class AddProductPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    WebElement cartMenuButton;

    @FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
    WebElement nameProduct;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    WebElement addToCartButton;

    @FindBy(xpath = "//td[contains(text(),'Samsung galaxy s6')]")
    WebElement productAppear;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/a[1]")
    WebElement deleteButton;


    @Step
    public void chooseProduct(){
        nameProduct.click();
    }

    @Step
    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    @Step
    public void handleAlert(){
//            waitForCondition().until(ExpectedConditions.alertIsPresent());
//            getDriver().switchTo().alert().accept();

        try {
            waitForCondition().until(ExpectedConditions.alertIsPresent());
            getDriver().switchTo().alert().accept();
        } catch (UnhandledAlertException u) {
            u.printStackTrace();
        }
    }

    @Step
    public void clickCartMenu(){
        waitForCondition()
                .until(ExpectedConditions.elementToBeClickable(cartMenuButton))
                .click();
    }

    @Step
    public void validateProduct() throws InterruptedException {
        waitForElement().until(ExpectedConditions.visibilityOf(productAppear)).waitUntilVisible();
        Thread.sleep(2000);
        deleteButton.click();
    }






}
