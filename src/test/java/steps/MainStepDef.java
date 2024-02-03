package steps;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.Then;
import t_mobile.page_objects.MainPage;

public class MainStepDef {

    private final MainPage mainPage = new MainPage();
    private final Logger LOG = LoggerFactory.getLogger(MainStepDef.class);

    @Then("the shopping cart with {int} product is available on the main page")
    public void shoppingCartNumberIsEqualTo(int expectedCount) {
        mainPage.shouldHaveCount(expectedCount);

        LOG.info(() -> "Count of products is equal to expected = " + expectedCount);
    }
}
