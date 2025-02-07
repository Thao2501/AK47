package theInternet.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class formAuthen {
    WebDriver driver;

    @BeforeTest
    public void setUpTest() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

//    @BeforeMethod
//    public void setUpMethod() {
//        driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/login");
//    }

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!", "https://the-internet.herokuapp.com/secure", "flash success", "You logged into a secure area!"},
                {"", "", "https://the-internet.herokuapp.com/login", "flash error", "Your username is invalid!"}
        };
    }

    @Test(dataProvider = "testData")
    public void authenticationFormTest(String username, String password, String expectedUrl, String expectedMessageClass, String expectedMessageContent) {
        // Clear fields before each test
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();

        // Input credentials and submit
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type=submit]")).click();

        // Verify URL
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "URL does not match!");

        // Verify message content
        String actualMessage = driver.findElement(By.className(expectedMessageClass.split(" ")[1])).getText();
        Assert.assertTrue(actualMessage.contains(expectedMessageContent), "Message content does not match!");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
