package theInternet.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SwagLabTest {
    WebDriver driver;
    @BeforeMethod
    void before(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @DataProvider
    Object[][] successAuthenticateData(){
        return new Object[][]{
                {"standard_user","secret_sauce","https://www.saucedemo.com/inventory.html","app_logo","Swag Labs"},
        };
    }

    @Test(dataProvider = "successAuthenticateData")
    void authenticationFormTest(String username,String password,String expectedUrl,String expectedMessageType,String expectedMessageContent) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type=submit]")).click();

        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
        String text = driver.findElement(By.className(expectedMessageType)).getText();
        Assert.assertTrue(driver.findElement(By.className(expectedMessageType)).getText().contains(expectedMessageContent));
    }

    @Test
    void authenticationFormEmpty() {
        driver.findElement(By.id("user-name")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.cssSelector("input[type=submit]")).click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
        String errorMsg = driver.findElement(By.cssSelector("h3[data-test=error]")).getText();
        Assert.assertTrue(errorMsg.contains("Epic sadface: Username is required"));
    }

    @Test
    void validUsernameEmptyPass(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.cssSelector("input[value=Login]")).click();

        String textErrorMsg = driver.findElement(By.cssSelector("h3[data-test=error]")).getText();
        Assert.assertEquals(textErrorMsg, "Epic sadface: Password is required");
    }
    @Test
    void validUserInvalidPass(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("mhvhg");
        driver.findElement(By.cssSelector("input[value=Login]")).click();

        String textErrorMsg = driver.findElement(By.cssSelector("h3[data-test=error]")).getText();
        Assert.assertEquals(textErrorMsg, "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    void invalidUser(){
        driver.findElement(By.cssSelector("input[id=user-name]")).sendKeys("thao");
        driver.findElement(By.id("password")).sendKeys("mhvhg");
        driver.findElement(By.cssSelector("input[value=Login]")).click();

        String textErrorMsg = driver.findElement(By.cssSelector("h3[data-test=error]")).getText();
        Assert.assertEquals(textErrorMsg, "Epic sadface: Username and password do not match any user in this service");
    }

    @AfterMethod
    void after(){
        driver.quit();
    }
}
