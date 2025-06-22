package org.example.DatePickerCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DatePickerCalenderExample {


    @Test
    public void enterTextExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        String expectedMonth = "November";
        String expectedYear = "2025";

        WebElement datepicker1 = driver.findElement(By.xpath("//input[@id='datepicker']"));
        datepicker1.click();

        while (true){
            WebElement actualMonthElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            String actualMonth = actualMonthElement.getText();
            WebElement actualYearElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String actualYear = actualYearElement.getText();

            if(actualMonth.equals(expectedMonth) && actualYear.equals(expectedYear)){
                List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
                for(WebElement date : allDates){
                    if(date.getText().equals("30")){
                        date.click();
                    }
                }
                break;
            }

            WebElement nextbtn = driver.findElement(By.xpath("//a[@title='Next']"));
            nextbtn.click();

        }



    }

}
