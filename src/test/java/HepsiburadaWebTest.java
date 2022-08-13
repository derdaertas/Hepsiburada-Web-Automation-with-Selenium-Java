import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HepsiburadaWebTest extends BaseTest
{

    @Test
    public void HepsiburadaWebEndtoEnd() throws InterruptedException {

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);


        //Giriş yap alanının üzerinde durulur
        /*hepsiburadaWeb.hoverOnElement(hepsiburadaWeb.girisYapAlani);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //giriş yap tıklanır
        hepsiburadaWeb.clickOnElement(hepsiburadaWeb.girisYapButonu);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //email adresi girilir
        hepsiburadaWeb.sendKeysToTheElement(hepsiburadaWeb.emailAlani,"derdaertas34@gmail.com");

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //giriş yap butonu tıklanır
        hepsiburadaWeb.clickOnElement(hepsiburadaWeb.emailGirisYapButonu);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //şifre girilir
        hepsiburadaWeb.sendKeysToTheElement(hepsiburadaWeb.sifreGirmeButon, "Derda123.");

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //giriş yap butonu tıklanır
        hepsiburadaWeb.clickOnElement(hepsiburadaWeb.sifreGirisYapButonu);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);
*/



        //arama alanına tıklanır ve hp tablet yazılır
        hepsiburadaWeb.sendKeysToTheElement(hepsiburadaWeb.aramaAlani,"hp tablet");

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //arama butonu tıklanır
        hepsiburadaWeb.clickOnElement(hepsiburadaWeb.aramaButonu);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //ekran aşağı kaydırılır
        hepsiburadaWeb.scrollDown();

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //arama sonuçlarından üçüncü ürüne gidilir
        hepsiburadaWeb.hoverOnElementFromList(hepsiburadaWeb.urunIsimleri,3);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //2. sekmeye geçiş
        hepsiburadaWeb.changeToSecondTab();

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //2. sekmeden ürün sepete eklenir
        hepsiburadaWeb.clickOnElement(hepsiburadaWeb.sepeteEkleButonUrunSayfasi);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //sepet dolu mu kontrol edilir
        hepsiburadaWeb.validateIsEquals(hepsiburadaWeb.beklenenSepetKontrolLabel,hepsiburadaWeb.getTextOfAnElement(hepsiburadaWeb.urunSepetteKontrolLabel));

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //sepete gidilir
        hepsiburadaWeb.clickOnElement(hepsiburadaWeb.sepeteGitButton);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //ürün sepetten silinir
        hepsiburadaWeb.clickOnElement(hepsiburadaWeb.urunSilButton);

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //sepet boş kontrol edilir
        hepsiburadaWeb.validateIsEquals(hepsiburadaWeb.beklenenSepetBoskontrolLabel,hepsiburadaWeb.getTextOfAnElement(hepsiburadaWeb.sepetBosKontrolLabel));

        //5 sn beklenir
        hepsiburadaWeb.waitSeconds(5);

        //validateIsEquals, changetab, webelement list içerisinden findelements

        //stackoverflow, seleniumtutorials, medium makaleleri
    }
}
