// класс покупки квартиры

package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import services.BuyService;

public class FlatBuy extends BaseTest {
    @Test
    @Description("Автотест проверяет страницу 'Купить', заполняет поля, и проваливается" +
            "в первое объявление поиска и выводит на экран номер телефона продавца")
    public void buy() {
        BuyService buyService = new BuyService();
        Assertions.assertTrue(buyService.buyFlat().getQrCodeIconBuyFlat().is(Condition.visible));
    }
}
