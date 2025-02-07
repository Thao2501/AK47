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
    @Parameters({"browser", "url"})
    @BeforeMethod
    void setUp(String browser, String url) {
        openBrowser(browser);
        visit(url);
    }

    @Test
    void dragDropTest() {
        visit(MousePage.getPageUrl() + "drag_and_drop");

        MousePage dragFrop = new MousePage();
        dragFrop.dragDropElements();

        Assert.assertEquals(dragFrop.getHeaderColumn1(), "B");
        Assert.assertEquals(dragFrop.getHeaderColumn2(), "A");
    }

    @Test
    void horizontalTest() {
        visit(MousePage.getPageUrl() + "horizontal_slider");

        MousePage horizontal = new MousePage();
        horizontal.horizontalSlider();
        horizontal.setClickHorizontal();

        Assert.assertTrue(horizontal.range().contains("5"));
    }

    @Test
    void clickRightTest() {
        visit(MousePage.getPageUrl() + "context_menu");

        MousePage clickRight = new MousePage();
        clickRight.setClickRight();
    }

    @Test
    void hoverToImage() {
        visit(MousePage.getPageUrl() + "hovers");

        MousePage hover = new MousePage();

        hover.setHover();

        Assert.assertEquals(hover.setImageProfile1(), "name: user1");
    }

    @Test
    void scrollDown() throws InterruptedException {
        visit(MousePage.getPageUrl() + "infinite_scroll");

        for (int i = 0; i < 5; i++) {
            actionScroll(0, 500);
            Thread.sleep(2000);
        }
    }

    @Test
    void keyPress() {
        visit(MousePage.getPageUrl() + "key_presses");
        MousePage keyPress = new MousePage();

        actionKeyPress("A");
        Assert.assertTrue(keyPress.setKeyPress().contains("You entered: A"));
    }

    @AfterMethod
    void tearDown(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            captureScreen(iTestResult.getName());
        }
        quit();
    }


}
