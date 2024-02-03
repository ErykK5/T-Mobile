package steps;

import io.cucumber.java.en.When;
import t_mobile.page_objects.DevicesPage;

public class DevicesStepDef {

    private final DevicesPage devicesPage = new DevicesPage();

    @When("the first product is added to shopping cart")
    public void addFirstProductToShoppingCart() {
        devicesPage.selectProductBy(0);
        devicesPage.clickAddToShoppingCart();
    }
}
