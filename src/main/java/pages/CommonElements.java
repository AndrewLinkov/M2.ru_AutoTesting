package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CommonElements {

    public static SelenideElement getElement(String text) {
        SelenideElement element = $x("//div[text()='" + text + "']");
        return element;
    }

    public static SelenideElement getSearchButton(String nameButton, int index) {
        return $x("(//span[text()='" + nameButton + "'])[" + index + "]");
    }

}