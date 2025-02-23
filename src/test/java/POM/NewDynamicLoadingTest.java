package POM;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import theInternet.pages.LoadingPage;

import static Support.Browser.*;

public class NewDynamicLoadingTest {
    @Parameters({"browser", "url"})
    @BeforeMethod
    void setUp(String browser, String url) {
        openBrowser(browser);
        visit(url + "dynamic_loading/1");
    }

    @Test
    void dynamicLoading() {
        LoadingPage loadingPage = new LoadingPage();

        loadingPage.clickButtonStart();

        loadingPage.waitToTextFinish();

        Assert.assertEquals(loadingPage.textFinish(), "Hello World!");
    }

    @AfterMethod
    void tearDown(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            captureScreen(iTestResult.getName());
        }
        quit();
    }
}
