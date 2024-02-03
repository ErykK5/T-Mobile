package t_mobile.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartPage {

    private final SelenideElement logoButton = $("[alt='T-Mobile - przejdź na stronę główną']");

    public void goToMainPage() {
        logoButton.click();
    }
}
