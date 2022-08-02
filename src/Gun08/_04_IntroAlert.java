package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1=driver.findElement(By.cssSelector("[class='btn btn-default']"));
        clickMe1.click();
        Bekle(2);

        driver.switchTo().alert().accept();// Alert kutucuğuna geçildi ve TAMAM butonuna basıldı
        Bekle(2);
        //kapattığında sayfaya dönmüş oluyorsun.

        BekleKapat();
    }
}
