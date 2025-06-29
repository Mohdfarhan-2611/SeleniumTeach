package org.example.Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class PaginationExamples {

    @Test
    public void staticTableExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> allPaginations = driver.findElements(By.xpath("//ul[@class='pagination']/li"));

        for(WebElement pagination : allPaginations){
            int totalRows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
            for (int r = 1; r < totalRows; r++) {
                String values = driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]/td[2]")).getText();
                System.out.println(values);
            }

            pagination.click();
        }

    }

}
