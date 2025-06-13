package org.example.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownExample2 {


    @Test(priority = 0)
    public void selectDropDownByIndex() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropDownElement = driver.findElement(By.id("colors"));
        Select dropdown = new Select(dropDownElement);
        dropdown.selectByIndex(1);
        dropdown.selectByIndex(2);

    }

}
