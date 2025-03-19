package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    @Step("Открытие главной страницы приложения M2.RU")
    public static void beforeAll() {
        System.setProperty("selenide.browser", "firefox");
        Configuration.browserSize = "1920x1080";
        Selenide.open("https://m2.ru/");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterAll
    @Step("Закрытие браузера")
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
