package pages;

import com.codeborne.selenide.SelenideElement;
import java.util.List;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PageBuy {
    private SelenideElement clickBuy = $x("//span[@data-test='buy-tab']");
    private SelenideElement entryFieldFlat = $x("//div[text()='Квартиру']");
    private List<SelenideElement> typeRoom = $$x("//div[@class='select-module--content--cf355']");
    private List<SelenideElement> buttonCountRoom = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
    private SelenideElement countRoom = $x("//div[@data-test='room-select-option:ROOM_2']");
    private List<SelenideElement> buttonPrice = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
    private SelenideElement priceRoom = $x("//div[@data-test='price-preset-to-10000000']");
    private List<SelenideElement> entryFieldRegion = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
    private SelenideElement region = $x("//div[text()='Московская область']");
    private SelenideElement buttonSearch = $x("//button[@data-gtm='main-click-promo-block-buytab-search-button']");
    private List<SelenideElement> enterOneRoom = $$x("//div[@class='LayoutSnippet__main']");
    private SelenideElement buttonPhoneNumber = $x("(//span[text()='Показать телефон'])[1]");


    public SelenideElement getClickBuy() {
        return clickBuy;
    }

    public SelenideElement getEntryFieldFlat() {
        return entryFieldFlat;
    }

    public List<SelenideElement> getTypeRoom() {
        return typeRoom;
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

    public List<SelenideElement> getEntryFieldRegion() {
        return entryFieldRegion;
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