package pages;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PageRent {
    private SelenideElement buttonRent = $x("//span[@data-test='rent-tab']");
    private List<SelenideElement> entryFieldFlat = $$x("//div[@class='button-module--content--73991 button-module--single--0e4e5']");
    private List<SelenideElement> buttonCountRoom = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
    private SelenideElement countRoom = $x("//div[@data-test='room-select-option:ROOM_2']");
    private List<SelenideElement> buttonPrice = $$x("//button[@class='button-module--button--acedd" +
            " button-module--l--92e06 button-module--primary--643a5 button-module--block--a5680']");
    private SelenideElement priceRoom = $x("//div[@class='input-module--wrapper--059b4 input-module--group--735f8']");
    private List<SelenideElement> buttonRegion = $$x("//div[@class='button-module--content--73991 button-module--single--0e4e5']");
    private SelenideElement region = $x("//div[@data-test='region-select-option:108']");
    private SelenideElement buttonSearch = $x("//button[@data-gtm='main-click-promo-block-renttab-search-button']");
    private List<SelenideElement> enterOneRoom = $$x("//div[@class='LayoutSnippet__main']");
    private SelenideElement buttonPhoneNumber = $x("(//span[text()='Показать телефон'])[1]");


    public SelenideElement getButtonRent() {
        return buttonRent;
    }

    public List<SelenideElement> getEntryFieldFlat() {
        return entryFieldFlat;
    }

    public List<SelenideElement> getButtonCountRoom() {
        return buttonCountRoom;
    }

    public SelenideElement getCountRoom() {
        return countRoom;
    }

    public List<SelenideElement> getButtonPrice() {
        return buttonPrice;
    }

    public SelenideElement getPriceRoom() {
        return priceRoom;
    }

    public List<SelenideElement> getButtonRegion() {
        return buttonRegion;
    }

    public SelenideElement getRegion() {
        return region;
    }

    public SelenideElement getButtonSearch() {
        return buttonSearch;
    }

    public List<SelenideElement> getEnterOneRoom() {
        return enterOneRoom;
    }

    public SelenideElement getButtonPhoneNumber() {
        return buttonPhoneNumber;
    }
}
