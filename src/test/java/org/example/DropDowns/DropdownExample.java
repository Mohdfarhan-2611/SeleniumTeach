package org.example.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownExample {


    @Test(priority = 0)
    public void selectDropDownByIndex() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropDownElement = driver.findElement(By.id("country"));
        Select dropdown = new Select(dropDownElement);
        dropdown.selectByIndex(1);
        dropdown.selectByIndex(2);


    }


    @Test(priority = 1)
    public void selectDropDownByValue() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropDownElement = driver.findElement(By.id("country"));
        Select dropdown = new Select(dropDownElement);
        dropdown.selectByValue("germany");

    }


    @Test(priority = 2)
    public void selectDropDownByVisibleText() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropDownElement = driver.findElement(By.id("country"));
        Select dropdown = new Select(dropDownElement);
        dropdown.selectByVisibleText("Brazil");

    }


    @Test(priority = 2)
    public void printDropdownSize() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropDownElement = driver.findElement(By.id("country"));
        Select dropdown = new Select(dropDownElement);
        List<WebElement> allOptions = dropdown.getOptions();
        System.out.println("options in dropdown: "+allOptions.size());

        //normal for loop
        for(int i=0; i<allOptions.size(); i++){
            System.out.println(allOptions.get(i).getText());

        }

        System.out.println("================");
        //for each
        for(WebElement option : allOptions){
            System.out.println(option.getText());
        }

        driver.quit();
    }


}
