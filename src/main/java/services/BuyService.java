package services;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.ResultPageQRCode;
import pages.PageBuy;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.switchTo;

public class BuyService {
    private PageBuy pageBuy = new PageBuy();
    private int rooms;
    private int coasts;
    private String region;

    public BuyService(int rooms, int coasts, String region) {
        this.rooms = rooms;
        this.coasts = coasts;
        this.region = region;
    }

    public ResultPageQRCode buyFlat() {
        //1. Нажать кнопку купить
        pageBuy.getClickBuy().click();

        //2. Нажать на кнопку тип помещений
        pageBuy.getEntryFieldFlat().click();

        //3. Выбрать помещение - Квартира
        List<SelenideElement> listBuyFlat = pageBuy.getTypeRoomFlat();
        listBuyFlat.get(0).click();

        //4. нажать на кнопку "Комнат"
        List<SelenideElement> rooms = pageBuy.getButtonCountRoom();
        rooms.get(0).click();
        //5. Выбрать значение комнат: 2-комнатные
        pageBuy.getCountRoom().click();

        //6. Нажать на кнопку "Цена"
        List<SelenideElement> priceFlatBuy = pageBuy.getButtonPrice();
        priceFlatBuy.get(1).click();

        //7. выбрать значение 10 000 000 руб.
        pageBuy.getPriceRoom().click();

        //8. Нажать на кнопку "Регион"
        List<SelenideElement> regionFlatBuy = pageBuy.getEntryFieldRegion();
        regionFlatBuy.get(2).click();
        //9 Выбрать регион Московская область
        pageBuy.getRegion().click();

        //10. Нажатие кнопки "Найти"
        pageBuy.getButtonSearch().click();

        //11. Зайти в первое объявление
        List<SelenideElement> numberAnnouncementBuy = pageBuy.getEnterOneRoom();
        numberAnnouncementBuy.get(0).click();

        //12. Показать номер телефона объявления
        switchTo().window(1);
        //ожидание
        pageBuy.getButtonPhoneNumber().shouldBe(Condition.interactable, Duration.ofSeconds(7)).click();

        ResultPageQRCode resultPageQRCode = new ResultPageQRCode();
        resultPageQRCode.getQrCodeIconBuyFlat().shouldBe(Condition.visible, Duration.ofSeconds(10));
        return resultPageQRCode;
    }
}
