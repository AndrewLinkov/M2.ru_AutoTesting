package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.BuyService;

public class FlatBuy extends BaseTest {
    @Test
    @Description("ТК проверки вкладки 'Купить'. Автотест заполняет поля, и проваливается" +
            "в первое объявление поиска, выводит на экран номер телефона продавца")
    public void buy() {
        BuyService buyService = new BuyService();
        Assertions.assertTrue(buyService.buyFlat().getQrCodeIconBuyFlat().is(Condition.visible));
    }
}
