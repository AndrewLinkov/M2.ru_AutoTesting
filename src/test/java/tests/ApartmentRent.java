//класс аренды квартиры

package tests;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class ApartmentRent extends BaseTest {
    /*
        1. Нажать кнопку Снять
        2. Заполнить поля
        3. Нажать кнопку найти
        4. Зайти в первое объявление
        5. Показать номер телефона
     */
    @Test
    public void rent() {
        //1. Нажать кнопку Снять
        $x("//span[@data-test='rent-tab']").click();
        //2. Заполнить поля

        // 3. Нажатие кнопки найти
        $x("//span[@data-gtm='main-click-promo-block-renttab-search-button']").click();
        //4. Зайти в первое объявление

        //5. Показать номер телефона
        sleep(5000);
    }
}
