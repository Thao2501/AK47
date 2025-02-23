package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Support.Browser.*;

public class TablePage {
    private By buttonClick = By.className("confirm-dates");
    private By pickCalendar = By.cssSelector(".ui-datepicker-calendar");
    private By pickDate = By.tagName("a");
    private String valueBeginDate = "10";
    private String valueEndDate = "4";
    private By expected = By.id("roundtrip-date-depart");
    private By agree = By.id("cookie-agree");
    private By depart = By.id("roundtrip-date-depart");

    public void selectBeginDate() {
        findElements(pickCalendar)
                .get(0)
                .findElements(pickDate)
                .stream()
                .filter(d -> d.getText().contains(valueBeginDate))
                .findFirst()
                .get()
                .click();
    }
    public void selectEndDate(){
        findElements(pickCalendar)
                .get(1)
                .findElements(pickDate)
                .stream()
                .filter(d -> d.getText().contains(valueEndDate))
                .findFirst()
                .get()
                .click();
    }
    public void clickConfirmButton(){
        click(buttonClick);
    }

    public WebElement setExpected(){
        return findElement(expected);
    }

    public void clickAgreeButton(){
        click(agree);
    }

    public void clickDepartButton(){
        click(depart);
    }
}
