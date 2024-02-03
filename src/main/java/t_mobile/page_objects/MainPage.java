package t_mobile.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    private final SelenideElement shoppingCartIcon = $$("div.rounded-full").filterBy(visible).first();

    public MainPage shouldHaveCount(int expectedCount) {
        shoppingCartIcon.shouldHave(text(String.valueOf(expectedCount)));
        return this;
    }
}
