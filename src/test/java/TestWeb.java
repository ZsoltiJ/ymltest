import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWeb {
    WebDriver driver;

    @BeforeEach
    public void VideoBrowsing() {
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // teljes képernyőőben való használat
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options); // új böngésző nyitása az opciókkal
        driver.get("https://codecool.com/hu/");
    }

    @Test
    public void WebTest() {
        String url = driver.getCurrentUrl();
        assertEquals("https://codecool.com/hu/", url);
    }

    @Test
    public void WebTest2() {
        String url = driver.getCurrentUrl();
        assertEquals("https://codecool.com/hu/", url);
    }

    @Test
    public void WebTest3() {
        String url = driver.getCurrentUrl();
        assertEquals("https://codecool.com/", url);
    }

    @AfterEach
    public void stopProcess() { driver.quit(); }
}
