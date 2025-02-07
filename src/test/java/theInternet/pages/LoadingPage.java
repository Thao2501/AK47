package theInternet.pages;

import org.openqa.selenium.By;

import static Support.Browser.*;

public class LoadingPage {
    private By buttonStart = By.xpath("//button[.='Start']");
    public static By textFinish = By.id("finish");

    public void clickButtonStart(){
        click(buttonStart);
    }
    public String setTextFinish(){
        return getText(textFinish);
    }
}

