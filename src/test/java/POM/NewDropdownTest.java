package POM;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import theInternet.pages.DropdownPage;

import static Support.Browser.*;

public class NewDropdownTest {
    DropdownPage dropdownPage;
    @Parameters({"browser", "url"})
    @BeforeMethod
    void setUp(String browser, String url) {
        openBrowser(browser);
        visit(url + "dropdown");
        dropdownPage = new DropdownPage();
    }

    @Test
    void selectOption1() {
        dropdownPage.select("Option 1");
        Assert.assertTrue(dropdownPage.isOptionSelected("Option 1"));
    }

    @Test
    void selectOption2() {
        dropdownPage.select("Option 2");
        Assert.assertTrue(dropdownPage.isOptionSelected("Option 2"));
    }

    @AfterMethod
    void tearDown(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            captureScreen(iTestResult.getName());
        }
        quit();
    }
}
