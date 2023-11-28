package services;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.CommonElements;
import pages.PageRent;
import pages.ResultPageQRCode;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class RentService {
    private PageRent pageRent = new PageRent();
    private int rooms;
    private int coasts;
    private String region;

    public RentService(int rooms, int coasts, String region ) {
        this.rooms = rooms;
        this.coasts = coasts;
        this.region = region;
    }

    public ResultPageQRCode rentFlat() {
        //1. Нажать кнопку Снять
        pageRent.getClickRent().click();

        //2. Нажать кнопку тип помещения
        List<SelenideElement> flatListRent = pageRent.getEntryFieldFlat();
        flatListRent.get(1).click();

        //3. Выбрать помещение - Квартира
        List<SelenideElement> listTypeRoom = pageRent.getTypeRoom();
        listTypeRoom.get(0).click();

        //4.Нажать на кнопку "Комнат"
        List<SelenideElement> rooms = pageRent.getButtonCountRoom();
        rooms.get(3).click();

        //5. Выбрать значение "2-ч комнатная"
        pageRent.getCountRoom().click();

        //6. Нажать на кнопку "Цена"
        List<SelenideElement> priceFlatRent = pageRent.getButtonPrice();
        priceFlatRent.get(4).click();
        //7. Выбрать стоимость
        pageRent.getPriceRoom().click();

        //8. Нажать кнопку регион
        List<SelenideElement> regionFlatRent = pageRent.getButtonRegion();
        regionFlatRent.get(7).click();
        //9. Выбрать регион
        pageRent.getRegion().click();

        //10. Нажать кнопку: Найти
        pageRent.getButtonSearch().click();

        //11. Зайти в первое объявление
        List<SelenideElement> numberAnnouncementRent = pageRent.getEnterOneRoom();
        numberAnnouncementRent.get(0).click();

        //12. Показать номер телефон
        switchTo().window(1);

        pageRent.getButtonPhoneNumber().click();
        ResultPageQRCode resultPageQRCode = new ResultPageQRCode();
        resultPageQRCode.getQrCodeIconBuyFlat().shouldBe(Condition.visible, Duration.ofSeconds(10));
        return resultPageQRCode;
    }
}
