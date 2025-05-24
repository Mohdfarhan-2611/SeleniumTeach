package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Farhan");

        Thread.sleep(5000);

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("mhdfarhan@gamil.com");













    }
}
