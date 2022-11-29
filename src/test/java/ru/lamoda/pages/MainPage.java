package ru.lamoda.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private static final SelenideElement searchInput = $x("//div[@class='_root_xf7ng_2']//input");

    @Step("Поиск товара в поисковой строке")
    public CatalogPage searchItem(String item) {
        searchInput.setValue(item).pressEnter();
        return new CatalogPage();
    }
}
