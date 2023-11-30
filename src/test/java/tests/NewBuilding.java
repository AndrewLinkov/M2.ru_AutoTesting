package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.NewBuildingService;

public class NewBuilding extends BaseTest{
    @Test
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
