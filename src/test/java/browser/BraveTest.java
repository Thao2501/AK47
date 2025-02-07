package browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BraveTest {
    @Test
    public void openWithBrave() {

        // Thiết lập để sử dụng Brave Browser
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe"); // Đường dẫn đến Brave executable

        // Tạo WebDriver với ChromeOptions đã cấu hình
        WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.selenium.dev/");
            Assert.assertEquals("Selenium", driver.getTitle());
            driver.quit();
        }
    }


