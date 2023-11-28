package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PageNewBuilding {
    // Прописать локаторы элементов Геттеры и сеттеры
    private SelenideElement clickNewBuilding = $x("//span[@data-test='new-building-tab']");

    public SelenideElement getClickNewBuilding() {
        return clickNewBuilding;
    }
}
