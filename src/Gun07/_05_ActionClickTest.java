package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));
        Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        System.out.println("Aksiyon ön cesi Aksiyonlar sınıfı oluşturuldu");

        Action aksiyon=aksiyonlar.moveToElement(element).click().build(); // elemanın üzerine git CLICK ı hazırla demek
        System.out.println("Aksiyon hazırlandı");
        Bekle(2);

        aksiyon.perform();// aksiyonu gerçekleştir
        System.out.println("Aksiyon gerçekleşti");

        // aksiyonlar.moveToElement(element).click().build().perform(); kısa hali.

        BekleKapat();

    }
}
