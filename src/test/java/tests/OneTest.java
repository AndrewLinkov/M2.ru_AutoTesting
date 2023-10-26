package tests;


import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class OneTest {
    @Test
    public void successfulSearchTest() {
        open("https://m2.ru/");
        sleep(5000);

    }
}
