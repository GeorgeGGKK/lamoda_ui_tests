package ru.lamoda.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CatalogPage {
    private static final ElementsCollection productNames = $$x("//div[@class='x-product-card-description__product-name']");

    @Step("Проверка найденного товара")
    public void checkProducts(String item) {
        List<String> itemsList = new ArrayList<>();
        productNames.first().shouldBe(Condition.visible);
        productNames.forEach(x -> itemsList.add(x.getText().toLowerCase()));
        for (int i = 0; i < itemsList.size(); i++) {
            assertTrue(itemsList.get(i).contains(item));
        }
    }
}
