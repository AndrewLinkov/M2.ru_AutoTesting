//класс аренды квартиры

package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.RentService;

public class FlatRent extends BaseTest {
    @Test
    @Description("Автотест проверяет страницу 'Аренда', заполняет поля, и проваливается" +
            "в первое объявление поиска и выводит на экран номер телефона арендадателя")
    public void rent() {
        RentService rentService = new RentService();
        Assertions.assertTrue(rentService.rentFlat().getQrCodeIconBuyFlat().is(Condition.visible));
    }
}
