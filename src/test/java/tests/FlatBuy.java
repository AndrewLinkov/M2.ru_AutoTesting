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
        List<SelenideElement> priceFlatBuy = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
        priceFlatBuy.get(1).click();

        //8. выбрать значение 10 000 000 руб.
        $x("//div[@data-test='price-preset-to-10000000']").click();

        //9. Нажать на кнопку "Регион"
        List<SelenideElement> regionFlatBuy = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
        regionFlatBuy.get(2).click();
        //10 Выбрать регион Московская область
        $x("//div[text()='Московская область']").click();

        //11. Нажатие кнопки "Найти"
        $x("//button[@data-gtm='main-click-promo-block-buytab-search-button']").click();

        //12. Зайти в первое объявление
        List<SelenideElement> numberAnnouncementBuy = $$x("//div[@class='LayoutSnippet__main']");
        numberAnnouncementBuy.get(0).click();

        //13. Показать номер телефона объявления
        switchTo().window(1);
        $x("(//span[text()='Показать телефон'])[1]").click();
        sleep(5000);
    }
}
