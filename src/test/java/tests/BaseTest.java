package tests;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void beforeAll() {
        System.setProperty("selenide.browser", "firefox");
        Selenide.open("https://m2.ru/");
//        Configuration.browser = "firefox";

    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
