package step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page.AddProductPage;

public class AddProductStep {

    @Steps
    AddProductPage addProductPage;


    @When("Choose and click product on list")
    public void chooseAndClickProductOnList() throws InterruptedException {
        Thread.sleep(1000);
        addProductPage.chooseProduct();
    }

    @When("Click add to cart")
    public void clickAddToCart() {
        addProductPage.clickAddToCartButton();
    }

    @Then("User see alert and click ok")
    public void userSeeAlertAndClickOk() {
        addProductPage.handleAlert();


    }

    @When("Click cart on menu to navigate cart page")
    public void clickCartOnMenuToNavigateCartPage() {
        addProductPage.clickCartMenu();
    }

    @Then("Validate product on cart page")
    public void validateProductOnCartPage() throws InterruptedException {
        addProductPage.validateProduct();
        Thread.sleep(3000);
    }
}
