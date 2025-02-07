package POM;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import theInternet.pages.LoadingPage;

import static Support.Browser.*;
import static theInternet.pages.LoadingPage.textFinish;

public class NewDynamicLoadingTest {
    @Parameters({"browser", "url"})
    @BeforeClass
    void setUp(String browser, String url) {
        openBrowser(browser);
        visit(url + "dynamic_loading/1");
    }
    @Test
    void dynamicLoading() {
        LoadingPage loadingPage = new LoadingPage();
        loadingPage.clickButtonStart();
        timeWait(100);
        wait.until((ExpectedConditions.visibilityOfElementLocated(textFinish)));

        Assert.assertEquals(loadingPage.setTextFinish(),"Hello World!");
    }
}
