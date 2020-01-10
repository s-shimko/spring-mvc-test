package gui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage
{
    public SelenideElement account() {
        return $("#account");
    }
}
