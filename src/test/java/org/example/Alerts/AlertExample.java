package org.example.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertExample {


  //  @Test(priority = 0)
    public void simpleAlert(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement simpleAlertButton = driver.findElement(By.id("alertBtn"));
        simpleAlertButton.click();

        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

    }


    @Test(description = "verifing simeple alert",priority = 1)
    public void simpleAlert2(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement simpleAlertButton = driver.findElement(By.xpath("//button[@onClick='jsAlert()']"));
        simpleAlertButton.click();

        Alert simpleAlert = driver.switchTo().alert();
        String simpleAlertText = simpleAlert.getText();
        System.out.println(simpleAlertText);
        simpleAlert.dismiss();
        WebElement resultTextElement = driver.findElement(By.id("result"));
        String expectedResult = resultTextElement.getText();

        Assert.assertEquals(expectedResult, "You successfully clicked an alert");


    }


    @Test(description = "verifing confirmation alert",priority = 2)
    public void confirmationAlert() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement confirmationAlertButton = driver.findElement(By.xpath("//button[@onClick='jsConfirm()']"));
        confirmationAlertButton.click();
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.dismiss();
        WebElement resultTextElement = driver.findElement(By.id("result"));
        String expectedResult = resultTextElement.getText();
        Assert.assertEquals(expectedResult, "You clicked: Cancel");


    }


    @Test(description = "verifing prompt alert",priority = 2)
    public void promptAlert() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement promptAlertButton = driver.findElement(By.xpath("//button[@onClick='jsPrompt()']"));
        promptAlertButton.click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Welcome to prompt Alert");
        Thread.sleep(5000);
        promptAlert.accept();
        WebElement resultTextElement = driver.findElement(By.id("result"));
        String expectedResult = resultTextElement.getText();
        Assert.assertEquals(expectedResult, "You entered: Welcome to prompt Alert");


    }

}
