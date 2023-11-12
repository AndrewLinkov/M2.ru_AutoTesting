// класс покупки квартиры

package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class FlatBuy extends BaseTest {
    @Test
    public void buy() {
        /*
        ТК Покупка квартиры

        1. Нажать кнопку Купить
        2. Заполнить поле: Квартиру
           Заполнить поле: Комнат
           Заполнить поле: Цена
           Заполнить поле: Регион
        3. Нажать кнопку: Найти
        4. Зайти в первое объявление
        5. Показать номер телефона
         */

        //1. Нажать Купить
        $x("//span[@data-test='buy-tab']").click();

        //2. Заполнить поле Квартиру
        $x("//div[text()='Квартиру']").click();
        List<SelenideElement> flatListBuy = $$x("//div[@class='select-module--content--cf355']");
        flatListBuy.get(0).click();

        //Заполнить поле: Комнат
        List<SelenideElement> rooms = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
        rooms.get(0).click();
        $x("//div[@data-test='room-select-option:ROOM_2']").click();

        //Заполнить поле: Цена
        List<SelenideElement> priceFlatBuy = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
        priceFlatBuy.get(1).click();
        $x("//div[@data-test='price-preset-to-10000000']").click();

        //Заполнить поле: Регион
        List<SelenideElement> regionFlatBuy = $$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
        regionFlatBuy.get(2).click();
        $x("//div[text()='Московская область']").click();

        // 3. Нажатие кнопки найти
        $x("//button[@data-gtm='main-click-promo-block-buytab-search-button']").click();

        //4. Зайти в третье объявление
        List<SelenideElement> numberAnnouncementBuy = $$x("//div[@class='LayoutSnippet__main']");
        numberAnnouncementBuy.get(2).click();

        // 5. Показать номер телефона
        List<SelenideElement> numberPhoneBuy = $$x("//span[text()='Показать телефон']");
        numberPhoneBuy.get(0).click();
        sleep(5000);
    }
}
