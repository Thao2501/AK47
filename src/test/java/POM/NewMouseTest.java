package POM;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import theInternet.pages.MousePage;

import static Support.Browser.*;

public class NewMouseTest {
    MousePage mousePage;

    public static String getPageUrl() {
        return "https://the-internet.herokuapp.com/";
    }

    @Parameters({"browser", "url"})
    @BeforeMethod
    void setUp(String browser, String url) {
        openBrowser(browser);
        visit(url);
        mousePage = new MousePage();

    }

    @Test
    void dragDropTest() {
        visit(getPageUrl() + "drag_and_drop");

        mousePage.dragDropElements();

        Assert.assertEquals(mousePage.headerColumn1(), "B");
        Assert.assertEquals(mousePage.headerColumn2(), "A");
    }

    @Test
    void horizontalTest() {
        visit(getPageUrl() + "horizontal_slider");

        mousePage.clickAndHoldOnPointer();
        mousePage.clickOut();

        Assert.assertTrue(mousePage.range().contains("5"));
    }

    @Test
    void clickRightTest() {
        visit(getPageUrl() + "context_menu");

        mousePage.setClickRight();
    }

    @Test
    void hoverToImage() {
        visit(getPageUrl() + "hovers");

        mousePage.hoverImage();

        Assert.assertEquals(mousePage.imageProfile(), "name: user1");
    }

    @Test
    void scrollDown() throws InterruptedException {
        visit(getPageUrl() + "infinite_scroll");

        for (int i = 0; i < 5; i++) {
            actionScroll(0, 500);
            Thread.sleep(2000);
        }
    }

    @Test
    void keyPress() {
        visit(getPageUrl() + "key_presses");

        actionKeyPress("A");
        Assert.assertTrue(mousePage.resultKeyPress().contains("You entered: A"));
    }

    @AfterMethod
    void tearDown(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            captureScreen(iTestResult.getName());
        }
        quit();
    }


}
