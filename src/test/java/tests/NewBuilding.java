package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import services.NewBuildingService;

public class NewBuilding extends BaseTest{
        @Test
        @Description("Автотест проверяет страницу 'Новостройки', заполняет поля, и проваливается" +
                "в первое объявление поиска и выводит на экран номер телефона продавца")
        public void newBuildings() {
            NewBuildingService newBuildingService = new NewBuildingService(
                    "ЖК ФЕНИКC",
                    2,
                    15000000,
                    "Любой",
                    "Москва и область");
            Assertions.assertTrue(newBuildingService.buyNewBuilding().getQrCodeIconBuyFlat().is(Condition.visible));
        }
}
