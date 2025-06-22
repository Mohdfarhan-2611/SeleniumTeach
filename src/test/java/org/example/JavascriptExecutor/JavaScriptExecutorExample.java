package org.example.JavascriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorExample {

    @Test
    public void enterTextExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));
        //inputBox.sendKeys("Farhan");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','Farhan')", inputBox);
    }



    @Test
    public void clickExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement radiobtnFemale = driver.findElement(By.xpath("//input[@id='female']"));
        WebElement radiobtnMale = driver.findElement(By.xpath("//input[@id='male']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",radiobtnFemale);
        js.executeScript("arguments[0].click()",radiobtnMale);

    }

    @Test
    public void scollByPixelExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println(js.executeScript("return window.pageYOffset;"));
        js.executeScript("window.scrollBy(0,3000)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

    }


    @Test
    public void scollTillElementVisibleExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement uploadfileElemnt = driver.findElement(By.xpath("//h2[text()='Upload Files']"));
        js.executeScript("arguments[0].scrollIntoView();",uploadfileElemnt);
    }


    @Test
    public void scollTilltheEndExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

    }
}
