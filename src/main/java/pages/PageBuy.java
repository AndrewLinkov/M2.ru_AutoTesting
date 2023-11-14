package pages;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PageBuy {
    private SelenideElement clickBuy = $x("//span[@data-test='buy-tab']");
    private SelenideElement entryFieldFlat = $x("//div[text()='Квартиру']");
    private List<SelenideElement> typeRoomFlat = $$x("//div[@class='select-module--content--cf355']");
    private List<SelenideElement> buttonCountRoom = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
    private SelenideElement countRoom = $x("//div[@data-test='room-select-option:ROOM_2']");


    public SelenideElement getClickBuy() {
        return clickBuy;
    }
    public SelenideElement getEntryFieldFlat() {
        return entryFieldFlat;

    }
    public List<SelenideElement> getTypeRoomFlat() {
        return typeRoomFlat;
    }

    public List<SelenideElement> getButtonCountRoom() {
        return buttonCountRoom;
    }

    public SelenideElement getCountRoom() {
        return countRoom;
    }
}