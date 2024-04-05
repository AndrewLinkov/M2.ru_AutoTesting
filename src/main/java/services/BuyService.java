package services;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.CommonElements;
import pages.ResultPageQRCode;
import pages.PageBuy;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.switchTo;

public class BuyService {
    PageBuy pageBuy = new PageBuy();

    @Step("Выбор вкладки 'Купить', заполнение полей ввода")
    public ResultPageQRCode buyFlat() {
        //1. Нажать кнопку купить
        pageBuy.getClickBuy().click();

        //2. Нажать на кнопку тип помещений
        pageBuy.getEntryFieldFlat().click();

        //3. Выбрать помещение - Квартира
        CommonElements.getElement("Квартиру").click();

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
        CommonElements.getSearchButton("Найти", 1).click();
//        pageBuy.getButtonSearch().click();

        //11. Зайти в первое объявление
        List<SelenideElement> numberAnnouncementBuy = pageBuy.getEnterOneRoom();
        numberAnnouncementBuy.get(0).click();

        //12. Показать второе окно
        switchTo().window(1);

        //13. Нажать показать телелфон
        CommonElements.getSearchButton("Показать телефон", 1).shouldBe(Condition.interactable, Duration.ofSeconds(7)).click();

        //14. Проверка на наличие QR кода
        ResultPageQRCode resultPageQRCode = new ResultPageQRCode();
        resultPageQRCode.getQrCodeIconBuyFlat().shouldBe(Condition.visible, Duration.ofSeconds(10));
        return resultPageQRCode;
    }
}
