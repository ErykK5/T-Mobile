package steps;

import io.cucumber.java.en.When;
import t_mobile.page_objects.MenuPage;

public class MenuStepDef {

    private final MenuPage menuPage = new MenuPage();

    @When("{string} > {string} > {string} is selected")
    public void navigateToProduct(String menu, String subMenu, String product) {
        menuPage.clickCategory(menu);
        menuPage.clickSubCategory(subMenu, product);
    }
}
