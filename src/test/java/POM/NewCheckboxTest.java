package POM;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import theInternet.pages.CheckboxPage;

import static Support.Browser.*;

public class NewCheckboxTest {
    CheckboxPage checkboxPage;

    @Parameters({"browser", "url"})
    @BeforeMethod
    void setUp(String browser, String url) {
        openBrowser(browser);
        visit(url + "checkboxes");
        checkboxPage = new CheckboxPage();
    }

    @Test
    void verifyAbleSelectCheckboxes() {
        checkboxPage.checkAll();

        Assert.assertTrue(checkboxPage.checkbox1().isSelected());
        Assert.assertTrue(checkboxPage.checkbox2().isSelected());
    }

    @Test
    void verifyAbleUnSelectCheckboxes() {
        checkboxPage.uncheckAll();

        Assert.assertFalse(checkboxPage.checkbox1().isSelected());
        Assert.assertFalse(checkboxPage.checkbox2().isSelected());
    }

    @AfterMethod
    void tearDown(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            captureScreen(iTestResult.getName());
        }
        quit();
    }
}
