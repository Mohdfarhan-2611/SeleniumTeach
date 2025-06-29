package org.example.Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TablesExamples {


    @Test
    public void staticTableExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        int totalRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        int totalColumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();

        for(int r=2; r<=totalRows; r++){
            for(int c=1; c<=totalColumn; c++){
                String values = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
                System.out.println(values);
            }
        }
    }

    @Test
    public void staticTableExample2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        int totalRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        int totalColumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();

        for (int r = 2; r <= totalRows; r++) {
                String values = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[2]")).getText();
                System.out.println(values);

        }
    }
}
