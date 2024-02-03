package steps;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.When;
import t_mobile.page_objects.MenuPage;

public class MenuStepDef {

    private final MenuPage menuPage = new MenuPage();
    private final Logger LOG = LoggerFactory.getLogger(MenuStepDef.class);

    @When("{string} > {string} > {string} is selected")
    public void navigateToProduct(String menu, String subMenu, String product) {
        menuPage.clickCategory(menu);
        menuPage.clickSubCategory(subMenu, product);

        LOG.info(() -> "Menu element " + menu + " > " + subMenu + " > " + product + " is clicked");
    }
}
