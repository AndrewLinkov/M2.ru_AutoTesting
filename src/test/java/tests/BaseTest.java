package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    @Before
    public void beforeAll() {
        System.setProperty("selenide.browser", "firefox");
        Configuration.browserSize = "1920x1080";
        Selenide.open("https://m2.ru/");
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
