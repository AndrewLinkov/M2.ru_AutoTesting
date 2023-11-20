// класс покупки квартиры

package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.BuyService;

public class FlatBuy extends BaseTest {
    @Test
    public void buy() {
        BuyService buyService = new BuyService(2, 1000000,"Москва");
        Assertions.assertTrue(buyService.buyFlat().getQrCodeIconBuyFlat().is(Condition.visible));

    }
}
