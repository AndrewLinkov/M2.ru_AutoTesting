package services;

import pages.PageNewBuilding;
import pages.ResultPageQRCode;

import static com.codeborne.selenide.Selenide.sleep;

public class NewBuildingService {
    private PageNewBuilding pageNewBuilding = new PageNewBuilding();
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
        sleep(5000);
        // Выбрать поле Название ЖК
        // Заполнить поле Название ЖК

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
