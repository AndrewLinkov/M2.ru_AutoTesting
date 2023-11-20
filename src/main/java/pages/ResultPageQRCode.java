package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ResultPageQRCode {
    private final SelenideElement qrCodeIconBuyFlat = $x("//div[@class='OfferPhoneModalDesktop__qr']");

    public SelenideElement getQrCodeIconBuyFlat() {
        return qrCodeIconBuyFlat;
    }
}
