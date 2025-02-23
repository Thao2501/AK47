package POM;

import org.testng.Assert;
import org.testng.annotations.*;
import theInternet.pages.HyperlinkPage;

import static Support.Browser.*;


public class NewHyperlinkTest {
    @DataProvider
    Object[][] testData() {
        return new Object[][]{
                {"200", "https://the-internet.herokuapp.com/status_codes/200"},
                {"here", "https://the-internet.herokuapp.com/status_codes"},

                {"301", "https://the-internet.herokuapp.com/status_codes/301"},
                {"here", "https://the-internet.herokuapp.com/status_codes"},

                {"404", "https://the-internet.herokuapp.com/status_codes/404"},
                {"here", "https://the-internet.herokuapp.com/status_codes"},

                {"500", "https://the-internet.herokuapp.com/status_codes/500"},
                {"here", "https://the-internet.herokuapp.com/status_codes"},
        };
    }

    @Parameters({"browser", "url"})

    @BeforeClass
    void setUp(String browser, String url) {
        openBrowser(browser);
        visit(url + "status_codes");
    }

    @Test(dataProvider = "testData")
    void hyperlinkTest(String code, String expectedUrl) {
        HyperlinkPage hyperlinkPage = new HyperlinkPage();

        click(hyperlinkPage.clickLink(code));

        Assert.assertEquals(getCurrentUrl(), expectedUrl);
    }

    @AfterClass
    public void tearDown() {
        quit();
    }

}
