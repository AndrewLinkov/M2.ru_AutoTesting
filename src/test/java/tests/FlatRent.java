//класс аренды квартиры

package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.RentService;

public class FlatRent extends BaseTest {
    @Test
    public void rent() {
        RentService rentService = new RentService(2, 50000, "Москва");
        Assertions.assertTrue(rentService.rentFlat().getQrCodeIconBuyFlat().is(Condition.visible));
    }
}
