package t_mobile.page_objects;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MenuPage {

    private final ElementsCollection menuCategories = $$(".menu-dropdown-item");
    private final ElementsCollection subMenuCategories = $$("li > p");

    public void clickCategory(String name) {
        menuCategories.filterBy(text(name)).first().click();
    }

    public void clickSubCategory(String subCategory, String product) {
        subMenuCategories
                .filterBy(text(subCategory)).first().sibling(0).findAll("ul > li > a > span")
                .filterBy(text(product)).first().click();
    }
}
