package steps;

import io.cucumber.java.en.Given;
import t_mobile.page_objects.PopupBannerPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CommonStepDef {

    private final PopupBannerPage popupBannerPage = new PopupBannerPage();

    @Given("page {string} is loaded")
    public void pageIsLoaded(String expectedUrl) {
        open(expectedUrl);
        getWebDriver().manage().window().maximize();
        popupBannerPage.clickAccept();

        webdriver().shouldHave(url(expectedUrl));
    }
}
