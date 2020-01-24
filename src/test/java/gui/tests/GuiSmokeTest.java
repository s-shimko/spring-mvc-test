package gui.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import gui.pages.LoginPage;
import gui.pages.ProductsPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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

    @Disabled("Disabled")
    @Test
    public void loginTest(){
        LoginPage.open()
            .loginAs("1", "1");
        ProductsPage productsPage = thenAt(ProductsPage.class);
        productsPage.account().shouldBe(visible).shouldHave(text("Account: 1"));
//        Selenide.open("https://www.workfusion.com/products/");
//        String input = "//input[@name='emailAddress' and @class!='']";
//        String input2 = "//input[@name='emailAddress' and @class='  LV_invalid_field']";
//        String input3 = "//label[text()='Work email']/..//input";
//        String label ="//label[text()='Work email']/..";
//        String label2 ="//label[text()='\n" +
//            "                        First Name']/..";
//        Selenide.element(By.xpath(label)).shouldBe(visible).click();
//        Selenide.element(By.xpath(label2)).shouldBe(visible).click();
//        Selenide.element(By.xpath(input3)).sendKeys("asdf");
//        try
//        {
//            Thread.sleep(2000);
//        }
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
    }

    @AfterAll
    static void close() {
        Selenide.closeWebDriver();
    }
}
