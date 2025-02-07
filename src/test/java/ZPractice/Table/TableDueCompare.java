package ZPractice.Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TableDueCompare {

    @Test
    void tableDueCompare(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");

        driver.findElement(By.id("table1")).click();

        List<Double> listDue = driver.
                findElements(By.xpath("//table[@id='table1']/tbody/tr/td[4]"))
                .stream()
                .map(a ->Double.parseDouble(a.getText().replace("$","")))
                .collect(Collectors.toUnmodifiableList());
        System.out.println(listDue);

        Double max = listDue.stream().max(Comparator.naturalOrder()).get();

        int index = listDue.indexOf(max);

        System.out.println(index);


        String firstName = driver.findElement(By.xpath(String.format("//table[@id='table1']/tbody/tr[%d]/td[2]", index+1))).getText();
        String lastName = driver.findElement(By.xpath(String.format("//table[@id='table1']/tbody/tr[%d]/td[1]", index+1))).getText();

        String fullName = firstName + " " + lastName;

        Assert.assertEquals(fullName, "Jason Doe");

    }
}
