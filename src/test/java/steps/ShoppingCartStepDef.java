package steps;

import io.cucumber.java.en.And;
import t_mobile.page_objects.ShoppingCartPage;

public class ShoppingCartStepDef {

    private final ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @And("user is redirected to main view")
    public void userRedirectedToMainView() {
        shoppingCartPage.goToMainPage();
    }
}
