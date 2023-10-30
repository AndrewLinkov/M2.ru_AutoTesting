// класс покупки квартиры

package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        List<SelenideElement> flatList = $$x("//div[@class='select-module--content--cf355']");
        flatList.get(0).click();

        //Заполнить поле: Комнат
        //прописать массив из поля Регион
        $x("//div[text()='Комнат']").click();
        List<SelenideElement> roomsList = $$x("//div[@class='select-module--option--d5f8f']");
        roomsList.get(2).click();


        //Прописать массив из поля Регион
        //Заполнить поле: Цена
        $x("//div[text()='Цена']").click();
        $x("//div[@data-test='price-preset-to-10000000']").click();
        sleep(5000);

        //Заполнить поле: Регион
        List<SelenideElement> region =$$x("//div[@class='button-module--wrapper--e416d button-module--block--a5680 button-module--group--fb99c']");
        region.get(2).click();
        sleep(5000);
        //выбрать регион

        // 3. Нажатие кнопки найти
        $x("//button[@data-gtm='main-click-promo-block-buytab-search-button']").click();


        //4. Зайти в первое объявление


        // 5. Показать номер телефона
        $x("//button[@data-test='phone-button']").click();
        sleep(5000);
    }
}
