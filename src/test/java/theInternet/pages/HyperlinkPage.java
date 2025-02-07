package theInternet.pages;

import org.openqa.selenium.By;

public class HyperlinkPage {
    public static By clickLink(String code) {
        switch (code) {
            case "200":
                return  By.linkText("200");
            case "301":
                return  By.linkText("301");
            case "404":
                return  By.linkText("404");
            case "500":
                return  By.linkText("500");
            case "here":
                return  By.linkText("here");
        }
        return null;
    }

    }