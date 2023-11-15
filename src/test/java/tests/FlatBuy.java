// класс покупки квартиры

package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import pages.PageBuy;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class FlatBuy extends BaseTest {
    @Test
    public void buy() {
        PageBuy pageBuy = new PageBuy();
        //1. Нажать Купить
        pageBuy.getClickBuy().click();

        //3. Нажать на кнопку тип помещений
        pageBuy.getEntryFieldFlat().click();

        //4. Выбрать помещение - Квартира
        List<SelenideElement> listBuyFlat = pageBuy.getTypeRoomFlat();
        listBuyFlat.get(0).click();

        //5. нажать на кнопку "Комнат"
        List<SelenideElement> rooms = pageBuy.getButtonCountRoom();
        rooms.get(0).click();
        //6. Выбрать значение комнат: 2-комнатные
        pageBuy.getCountRoom().click();

        //7. Нажать на кнопку "Цена"
        List<SelenideElement> priceFlatBuy = pageBuy.getButtonPrice();
        priceFlatBuy.get(1).click();

        //8. выбрать значение 10 000 000 руб.
        pageBuy.getPriceRoom().click();

        //9. Нажать на кнопку "Регион"
        List<SelenideElement> regionFlatBuy = pageBuy.getEntryFieldRegion();
        regionFlatBuy.get(2).click();
        //10 Выбрать регион Московская область
        pageBuy.getRegion().click();

        //11. Нажатие кнопки "Найти"
        pageBuy.getButtonSearch().click();

        //12. Зайти в первое объявление
        List<SelenideElement> numberAnnouncementBuy = pageBuy.getEnterOneRoom();
        numberAnnouncementBuy.get(0).click();

        //13. Показать номер телефона объявления
        switchTo().window(1);
        pageBuy.getButtonPhoneNumber().click();
        sleep(5000);
    }
}
