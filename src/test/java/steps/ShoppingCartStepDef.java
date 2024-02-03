package steps;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.And;
import t_mobile.page_objects.ShoppingCartPage;

public class ShoppingCartStepDef {

    private final ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    private final Logger LOG = LoggerFactory.getLogger(ShoppingCartStepDef.class);

    @And("user is redirected to main view")
    public void userRedirectedToMainView() {
        shoppingCartPage.goToMainPage();

        LOG.info(() -> "User is redirected to main view");
    }
}
