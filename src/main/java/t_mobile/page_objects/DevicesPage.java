package t_mobile.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class DevicesPage {

    private final ElementsCollection products = $$("div.dt_productCards > a");
    private final SelenideElement addToBasket = $$("[data-qa='PRD_AddToBasket']").filterBy(visible).first();

    public void selectProductBy(int index) {
        products.get(index).click();
    }

    public void clickAddToShoppingCart() {
        addToBasket.shouldBe(visible).click();
    }
}
