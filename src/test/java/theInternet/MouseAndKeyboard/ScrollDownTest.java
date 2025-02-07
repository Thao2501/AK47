package theInternet.MouseAndKeyboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollDownTest {
    @Test
    void scrollDown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");

        Actions actions = new Actions(driver);

        for (int i = 0; i < 5; i++) {
            actions.scrollByAmount(0,500).perform();
            Thread.sleep(2000);
        }

    }
}
