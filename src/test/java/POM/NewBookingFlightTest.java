package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import theInternet.pages.TablePage;

import java.time.Duration;

import static Support.Browser.*;

public class NewBookingFlightTest {
    @Parameters({"browser", "url"})
    @BeforeMethod
    void setUp(String browser, String url) {
        openBrowser(browser);
        visit(url);
    }
    @Test
    void verifyAbleSelectDepartDate(){
        TablePage tablePage = new TablePage();

        maximize();

        tablePage.clickAgreeButton();

        timeWait(5);

        tablePage.clickDepartButton();

        tablePage.selectBeginDate();

        tablePage.selectEndDate();

        tablePage.clickConfirmButton();

        Assert.assertEquals(tablePage.setExpected().getDomProperty("value"),"10/02/2025");
    }
    @AfterMethod
    void tearDown(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            captureScreen(iTestResult.getName());
        }
        quit();
    }
}
