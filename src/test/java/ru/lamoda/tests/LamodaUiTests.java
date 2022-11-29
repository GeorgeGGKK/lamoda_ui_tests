package ru.lamoda.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.lamoda.data.TestData;
import ru.lamoda.pages.MainPage;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("UI Тесты на сайте Lamoda")
public class LamodaUiTests extends TestBase {
    TestData data = new TestData();
    MainPage mainPage = new MainPage();

    @Tag("Lamoda_UI")
    @Test
    @DisplayName("Проверка поиска товара в каталоге")
    public void searchProductsInCatalog() {
        mainPage
                .searchItem(data.getItem())
                .checkProducts(data.getItem());
    }

}
