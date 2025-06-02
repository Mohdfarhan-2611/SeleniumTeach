package org.example.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class ImplicityWait {


    @Test
    public void navigateMethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crio-qkart-frontend-qa.vercel.app/login");


        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("mhdfarhan2611@gmail.com");


        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Acc0@mf#7");


        WebElement loginBuuton = driver.findElement(By.xpath("//button[text()='Login to QKart']"));
        loginBuuton.click();


        WebElement loggedInuser = driver.findElement(By.xpath("//p[@class='username-text']"));
        String usertext = loggedInuser.getText();

        Assert.assertEquals(usertext, "mhdfarhan2611@gmail.com");








    }

}
