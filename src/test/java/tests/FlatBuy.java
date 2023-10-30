// класс покупки квартиры

package tests;

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
        2. Заполнить поля
        3. Нажать кнопку найти
        4. Зайти в первое объявление
        5. Показать номер телефона
         */


        //ВОПРОС: Нужно ли делать шаг когда он по умолчанию???
        //1. Нажать Купить
        $x("//span[@data-test='buy-tab']").click();
        //2. Заполнить поля
        //$x("//div[@class='select-module--wrapper--8677a']//div[@class='select-module--checkbox--5af48']");
        //List<WebElement> checBox = $x("//div[@class='select-module--wrapper--8677a']//div[@class='select-module--checkbox--5af48']");


        // 3. Нажатие кнопки найти
        $x("//button[@data-gtm='main-click-promo-block-buytab-search-button']").click();
        //4. Зайти в первое объявление

        // 5. Показать номер телефона
        $x("//button[@data-test='phone-button']").click();
        sleep(5000);
    }
}
