package t_mobile.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PopupBannerPage {

    private final SelenideElement acceptButton = $("button#didomi-notice-agree-button");

    public void clickAccept() {
        acceptButton.click();
    }
}
