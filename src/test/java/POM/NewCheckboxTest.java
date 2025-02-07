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
    @Parameters({"browser", "url"})
    @BeforeMethod
    void setUp(String browser, String url) {
        openBrowser(browser);
        visit(url + "checkboxes");
    }
    @Test
    void verifyAbleSelectCheckboxes() {
        CheckboxPage check = new CheckboxPage();
        check.CheckCheckbox();
        Assert.assertTrue(check.ClickCheckbox1().isSelected());
        Assert.assertTrue(check.ClickCheckbox2().isSelected());
    }

    @Test
    void verifyAbleUnSelectCheckboxes() {
        CheckboxPage uncheck = new CheckboxPage();
        uncheck.uncheckCheckbox();
        Assert.assertFalse(uncheck.ClickCheckbox1().isSelected());
        Assert.assertFalse(uncheck.ClickCheckbox2().isSelected());
    }

    @AfterMethod
    void tearDown(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()){
            captureScreen(iTestResult.getName());
        }
        quit();
    }
}
