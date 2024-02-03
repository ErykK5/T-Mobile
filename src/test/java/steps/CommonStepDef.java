package steps;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.Given;
import t_mobile.page_objects.PopupBannerPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CommonStepDef {

    private final PopupBannerPage popupBannerPage = new PopupBannerPage();
    private final Logger LOG = LoggerFactory.getLogger(CommonStepDef.class);

    @Given("page {string} is loaded")
    public void pageIsLoaded(String expectedUrl) {
        open(expectedUrl);
        getWebDriver().manage().window().maximize();
        popupBannerPage.clickAccept();

        webdriver().shouldHave(url(expectedUrl));
        LOG.info(() -> "Page is correctly loaded");
    }
}
