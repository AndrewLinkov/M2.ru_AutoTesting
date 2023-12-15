package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class pageNewBuilding {
    //1. Нажать вкладку Новостройки
    private SelenideElement clickNewBuilding = $x("//span[@data-test='new-building-tab']");
    // Выбрать поле Название ЖК
    private SelenideElement entryFieldNameJK = $x("//div[@class='input-module--wrapper--059b4']//input");
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


    public SelenideElement getClickNewBuilding() {
        return clickNewBuilding;
    }

    public SelenideElement getEntryFieldNameJK() {
        return entryFieldNameJK;
    }
}
