package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CommonElements {
    private SelenideElement clickBuy = $x("//span[@data-test='buy-tab']");
    private SelenideElement entryFieldFlat = $x("//div[text()='Квартиру']");



    public static SelenideElement getElement(String text) {

        SelenideElement element = $x("//div[text()='" + text + "']");
        return element;
    }
}

//div[text()='Квартира']