import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HepsiburadaWeb {
    private WebDriver driver;

    public By girisYapAlani = By.cssSelector("span[data-test-id='account']");

    public By girisYapButonu = By.id("login");

    public By emailAlani = By.id("txtUserName");

    public By emailGirisYapButonu = By.id("btnLogin");

    public By sifreGirmeButon = By.id("txtPassword");

    public By aramaAlani = By.cssSelector("input[type='text']");

    public By aramaButonu = By.cssSelector("div[class='SearchBoxOld-buttonContainer']");

    public By sifreGirisYapButonu = By.id("btnEmailSelect");

    public By urunIsimleri = By.cssSelector("h3[data-test-id='product-card-name']");

    public By sepeteEkleButonUrun = By.cssSelector("button[data-test-id='product-info-button']");

    public By sepeteEkleButonUrunSayfasi = By.id("addToCart");

    public By urunSepetteKontrolLabel = By.cssSelector("span[class='checkoutui-ProductOnBasketHeader-22Wrk']");

    public String beklenenSepetKontrolLabel = "Ürün sepetinizde";

    public By sepeteGitButton = By.cssSelector("div[class='checkoutui-ProductOnBasketHeader-m4tLG']>button");

    public By urunSilButton = By.cssSelector("a[class='product_delete_1zR-0']");

    public By sepetBosKontrolLabel = By.cssSelector("div[class='content_Z9h8v']>h1");

    public String beklenenSepetBoskontrolLabel = "Sepetin şu an boş";


    public HepsiburadaWeb(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnElement(By elementPath){
        WebElement element = driver.findElement(elementPath);
        element.click();
    }

    public void sendKeysToTheElement(By elementPath, String keyText) {
        WebElement element = driver.findElement(elementPath);
        element.click();
        //waitSeconds(2);
        element.sendKeys(keyText);
    }

    public void scrollDown(){
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,200)");
    }

    public void waitSeconds(long seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public String getTextOfAnElement (By elementPath){
        WebElement element = driver.findElement(elementPath);
        return element.getText();

    }
    public void validateIsEquals(String expectedCondition, String actualCondition)
    {
        Assert.assertEquals(expectedCondition,actualCondition);
    }

    public void clickOnElementFromList(By elementPath, int index){
        List<WebElement> elements = driver.findElements(elementPath);
        int productToChoose = index-1;
        elements.get(productToChoose).click();
    }

    public void hoverOnElement(By elementpath){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(elementpath);
        action.moveToElement(element).moveToElement(element).click().build().perform();
    }

    public void hoverOnElementFromList (By elementPath, int index){
        Actions action = new Actions(driver);
        List<WebElement> elements = driver.findElements(elementPath);
        int productToChoose = index-1;
        action.moveToElement(elements.get(productToChoose)).click().build().perform();
    }

    public void changeToSecondTab(){
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
    }

}
