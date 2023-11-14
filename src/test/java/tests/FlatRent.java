//класс аренды квартиры

package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class FlatRent extends BaseTest {
    /*
        ТК Аренда Квартиры

        1. Нажать кнопку Снять
        2. Заполнить поле: Квартиру
           Заполнить поле: Комнат
           Заполнить поле: Цена
           Заполнить поле: Регион
        3. Нажать кнопку: Найти
        4. Зайти в первое объявление
        5. Показать номер телефона
     */
    @Test
    public void rent() {
//        1. Нажать кнопку Снять
        $x("//span[@data-test='rent-tab']").click();

//        2. Заполнить поле: Квартиру
        List<SelenideElement> flatListRent = $$x("//div[@class='button-module--content--73991 button-module--single--0e4e5']");
        flatListRent.get(4).click();

//        Заполнить поле: Комнат
        List<SelenideElement> rooms = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
        rooms.get(3).click();
        $x("//div[@data-test='room-select-option:ROOM_2']").click();

//        Заполнить поле: Цена
        List<SelenideElement> priceFlatRent = $$x("//button[@class='button-module--button--acedd button-module--l--92e06 button-module--primary--643a5 button-module--block--a5680']");
        priceFlatRent.get(4).click();
        $x("//div[@class='input-module--wrapper--059b4 input-module--group--735f8']").click();

//        Заполнить поле: Регион
        List<SelenideElement> regionFlatRent = $$x("//div[@class='button-module--content--73991 button-module--single--0e4e5']");
        regionFlatRent.get(7).click();
        $x("//div[@data-test='region-select-option:108']").click();

//        3. Нажать кнопку: Найти
        $x("//button[@data-gtm='main-click-promo-block-renttab-search-button']").click();

//        4. Зайти в первое объявление
        List<SelenideElement> numberAnnouncementRent = $$x("//div[@class='LayoutSnippet__main']");
        numberAnnouncementRent.get(0).click();
        sleep(5000);

//        5. Показать номер телефон
        //$x("//span[text()='Показать телефон']").click();
        $x("//button[@data-test='offer-phone-call-1']").click();
        //button[@data-test="offer-phone-call-1"]
        sleep(5000);
    }
}
