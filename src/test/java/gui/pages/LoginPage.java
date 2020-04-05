package gui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage
{
    public SelenideElement loginField()
    {
        return $("#name");
    }

    public SelenideElement passwordField()
    {
        return $("#password");
    }

    public SelenideElement loginButton()
    {
        return $("button[value='login']");
    }

    public static LoginPage open()
    {
        return Selenide.open("/", LoginPage.class);
    }

    public void loginAs(String name, String password)
    {
        loginField().shouldBe(visible).setValue(name);
        passwordField().shouldBe(visible).setValue(password);
        loginButton().click();
    }
}
