package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class CalculateCredit {

    @Before
    public void beforeAll() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1200x850";
    }


    @Test
    public void Test() {
        open("https://m2.ru/");
        sleep(5000);
    }


    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
