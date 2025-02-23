package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Support.Browser.*;

public class LoadingPage {
    private By buttonStart = By.xpath("//button[.='Start']");
    private By textFinish = By.id("finish");

    public void clickButtonStart() {
        click(buttonStart);
    }

    public void waitToTextFinish() {
        wait.until((ExpectedConditions.visibilityOfElementLocated(textFinish)));
    }

    public String textFinish() {
        return getText(textFinish);
    }
}

