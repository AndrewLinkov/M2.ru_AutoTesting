//класс аренды квартиры

package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import pages.PageRent;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class FlatRent extends BaseTest {
    @Test
    public void rent() {
        PageRent pageRent = new PageRent();
        //1. Нажать кнопку Снять
        pageRent.getButtonRent().click();

        //2. выбрать поле: Квартиру
        List<SelenideElement> flatListRent = pageRent.getEntryFieldFlat();
        flatListRent.get(4).click();

        //3.Нажать на кнопку "Комнат"
        List<SelenideElement> rooms = pageRent.getButtonCountRoom();
        rooms.get(3).click();
        //4. Выбрать значение "2-ч комнатная"
        pageRent.getCountRoom().click();

        //5. Нажать на кнопку "Цена"
        List<SelenideElement> priceFlatRent = pageRent.getButtonPrice();
        priceFlatRent.get(4).click();
        //6. Выбрать стоимость
        pageRent.getPriceRoom().click();

        //7. Нажать кнопку регион
        List<SelenideElement> regionFlatRent = pageRent.getButtonRegion();
        regionFlatRent.get(7).click();
        //8. Выбрать регион
        pageRent.getRegion().click();

        //9. Нажать кнопку: Найти
        pageRent.getButtonSearch().click();

        //10. Зайти в первое объявление
        List<SelenideElement> numberAnnouncementRent = pageRent.getEnterOneRoom();
        numberAnnouncementRent.get(0).click();

        //11. Показать номер телефон
        switchTo().window(1);
       pageRent.getButtonPhoneNumber().click();
        sleep(5000);
    }
}
