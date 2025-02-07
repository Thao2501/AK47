package theInternet.Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BookingFlightTest {
    @Test
    void verifyAbleSelectDepartDate(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vietnamairlines.com/vn/en/home");
        driver.manage().window().maximize();
        driver.findElement(By.id("cookie-agree")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.findElement(By.id("roundtrip-date-depart")).click();

        driver.findElements(By.cssSelector(".ui-datepicker-calendar"))
                .get(0)
                .findElements(By.tagName("a"))
                .stream()
                .filter(d -> d.getText().contains("10"))
                .findFirst()
                .get()
                .click();

        driver.findElements(By.cssSelector(".ui-datepicker-calendar"))
                .get(1)
                .findElements(By.tagName("a"))
                .stream()
                .filter(d -> d.getText().contains("4"))
                .findFirst()
                .get()
                .click();

        driver.findElement(By.className("confirm-dates")).click();

        Assert.assertEquals(driver.findElement(By.id("roundtrip-date-depart")).getDomProperty("value"),"10/01/2025");
    }

}
