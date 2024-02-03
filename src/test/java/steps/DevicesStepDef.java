package steps;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.When;
import t_mobile.page_objects.DevicesPage;

public class DevicesStepDef {

    private final DevicesPage devicesPage = new DevicesPage();
    private final Logger LOG = LoggerFactory.getLogger(DevicesStepDef.class);

    @When("the first product is added to shopping cart")
    public void addFirstProductToShoppingCart() {
        devicesPage.selectProductBy(0);
        devicesPage.clickAddToShoppingCart();

        LOG.info(() -> "First product is selected");
        LOG.info(() -> "Product added to the bucket");
    }
}
