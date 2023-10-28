package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;



public class BaseTest {

    @Before
    public void beforeAll() {
        Selenide.open("https://m2.ru/");
//        Configuration.browser = "firefox";
//        Configuration.browserSize= "1500x800";
//        Configuration.headless = false; //
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
