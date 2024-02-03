package steps;

import io.cucumber.java.en.Then;
import t_mobile.page_objects.MainPage;

public class MainStepDef {

    private final MainPage mainPage = new MainPage();

    @Then("the shopping cart with {int} product is available on the main page")
    public void shoppingCartNumberIsEqualTo(int expectedCount) {
        mainPage.shouldHaveCount(expectedCount);
    }
}
