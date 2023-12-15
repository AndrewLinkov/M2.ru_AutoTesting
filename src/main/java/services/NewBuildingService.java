package services;

import org.openqa.selenium.Keys;
import pages.pageNewBuilding;
import pages.ResultPageQRCode;

import static com.codeborne.selenide.Selenide.sleep;

public class NewBuildingService {
    private pages.pageNewBuilding pageNewBuilding = new pageNewBuilding();
    private String nameComplex;
    private int rooms;
    private int price;
    private String status;
    private String region;

    public NewBuildingService(String nameCompelx, int rooms, int price, String status, String region) {
        this.nameComplex = nameCompelx;
        this.rooms = rooms;
        this.price = price;
        this.status = status;
        this.region = region;
    }

    public ResultPageQRCode buyNewBuilding() {
        //1. Нажать вкладку Новостройки
        pageNewBuilding.getClickNewBuilding().click();
        // Выбрать поле Название ЖК
        pageNewBuilding.getEntryFieldNameJK().click();
        //pageNewBuilding.getEntryFieldNameJK().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        sleep(5000);
        // Заполнить поле Название ЖК
        pageNewBuilding.getEntryFieldNameJK().setValue(nameComplex);
        pageNewBuilding.getEntryFieldNameJK().sendKeys(Keys.ARROW_UP,Keys.ENTER);
        // Выбрать поле Кол-во комнат
        // Заполнить поле Кол-во комнат

        // Выбрать поле Цена
        // Заполнить поле Цена

        // Выбрать поле срок сдачи
        // Заполнить поле Срок сдачи

        // Выбрать поле регион
        // Заполнить поле регион

        // Нажать кнопку Найти

        // Выбрать первое объявление в списке

        // Нажать кнопку Показать телефон
        return buyNewBuilding();
    }
}