package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {
    @BeforeAll
    public static void beforeAll() {
        //System.setProperty("selenide.browser", "firefox");
        System.setProperty("webdriver.chrome.driver", "D:\\!документы Андрей\\Desktop\\AutoTesting\\M2.ru_AutoTesting\\chromedriver.exe");
        Configuration.browserSize = "1920x1080";
        Selenide.open("https://m2.ru/");
    }

    @AfterAll
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
