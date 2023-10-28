// класс покупки квартиры

package tests;

import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class ApartmentBuy extends BaseTest{
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

        // 3. Нажатие кнопки найти
        $x("//button[@data-gtm='main-click-promo-block-buytab-search-button']").click();
        //4. Зайти в первое объявление

        // 5. Показать номер телефона
        $x("//button[@data-test='phone-button']").click();
        sleep(5000);
    }
}
