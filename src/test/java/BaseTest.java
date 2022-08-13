import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;
    HepsiburadaWeb hepsiburadaWeb;

    @BeforeAll
    public void setUp()
    {
        System.out.println("Driver ayağa kaldırılıyor...");
        System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver");
        driver = new FirefoxDriver();
        System.out.println("Driver ayağa kaldırıldı.");

        hepsiburadaWeb = new HepsiburadaWeb(driver);

        driver.get("https://www.hepsiburada.com/");

        driver.manage().window().maximize();

        System.out.println("Hepsiburada Web Sayfası açıldı.");
    }

    @AfterAll
    public void tearDown()
    {
        //driver.quit();
        System.out.println("Driver kapatıldı.");
    }

}
