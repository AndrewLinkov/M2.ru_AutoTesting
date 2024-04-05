package services;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.CommonElements;
import pages.PageRent;
import pages.ResultPageQRCode;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.switchTo;

public class RentService {
    PageRent pageRent = new PageRent();

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
        //pageRent.getButtonSearch().click();
        CommonElements.getSearchButton("Найти", 2).shouldBe(Condition.interactable, Duration.ofSeconds(7)).click();

        //11. Зайти в первое объявление
        List<SelenideElement> numberAnnouncementRent = pageRent.getEnterOneRoom();
        numberAnnouncementRent.get(1).click();

        //12. Показать второе окно
        switchTo().window(1);

        //13. Нажать показать телефон
        CommonElements.getSearchButton("Показать телефон", 1).shouldBe(Condition.interactable, Duration.ofSeconds(7)).click();

        //14. Проверка на наличие QR кода
        ResultPageQRCode resultPageQRCode = new ResultPageQRCode();
        resultPageQRCode.getQrCodeIconBuyFlat().shouldBe(Condition.visible, Duration.ofSeconds(10));
        return resultPageQRCode;
    }
}
