package Gun07;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Facebook extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https:/www.facebook.com");
        Bekle(1);

        WebElement cookiesAccept=driver.findElement(By.xpath("//*[text()='Temel ve isteğe bağlı çerezlere izin ver']"));
        cookiesAccept.click();

        Bekle(2);

        WebElement btnYeniHesap=driver.findElement(By.cssSelector("[id^='u_0_0_']"));
        btnYeniHesap.click();


        WebElement txtIsim=driver.findElement(By.name("firstname"));
        txtIsim.sendKeys("bekir");
        Bekle(1);
        WebElement txtSoyisim=driver.findElement(By.name("lastname"));
        txtSoyisim.sendKeys("akça");
        Bekle(1);

        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed());

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("bekirakca@gmail.com");

        Assert.assertTrue(reEmail.isDisplayed());

        BekleKapat();



    }
}
