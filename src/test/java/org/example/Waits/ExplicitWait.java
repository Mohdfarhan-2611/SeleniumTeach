package org.example.Waits;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait {


    @Test
    public void navigateMethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crio-qkart-frontend-qa.vercel.app/login");

        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("mhdfarhan2611@gmail.com");


        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Acc0@mf#7");


        WebElement loginBuuton = driver.findElement(By.xpath("//button[text()='Login to QKart']"));
        loginBuuton.click();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='username-text']")));

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30)) // Wait for a maximum of 10 seconds
                .pollingEvery(Duration.ofSeconds(10)) // Check every 500 milliseconds
                .ignoring(TimeoutException.class); // Ignore NoSuchElementException


        // Wait for an element to be clickable
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='username-text']")));



        String usertext = element.getText();
        Assert.assertEquals(usertext, "mhdfarhan2611@gmail.com");






    }

    }
