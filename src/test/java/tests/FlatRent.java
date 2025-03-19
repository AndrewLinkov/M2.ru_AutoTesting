package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.RentService;

public class FlatRent extends BaseTest {
    @Test
    @Description("ТК проверки вкладки 'Аренда'. Автотест заполняет поля, и проваливается" +
            "в первое объявление поиска, выводит на экран номер телефона арендадателя")
    public void rent() {
        RentService rentService = new RentService();
        Assertions.assertTrue(rentService.rentFlat().getQrCodeIconBuyFlat().is(Condition.visible));
    }
}
