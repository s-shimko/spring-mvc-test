package gui.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import gui.pages.LoginPage;
import gui.pages.ProductsPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class GuiSmokeTest
{
    private <T> T thenAt(Class<T> tClass) {
        return page(tClass);
    }

    @BeforeEach
    void setUp(){
        Configuration.baseUrl = "http://localhost:8091";
    }

    @Test
    public void loginTest(){
        LoginPage.open()
            .loginAs("1", "1");
        ProductsPage productsPage = thenAt(ProductsPage.class);
        productsPage.account().shouldBe(visible).shouldHave(text("Account: 1"));
    }

    @AfterAll
    static void close() {
        Selenide.closeWebDriver();
    }
}
