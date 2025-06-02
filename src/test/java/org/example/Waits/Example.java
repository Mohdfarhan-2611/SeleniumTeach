package org.example.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Example {



    @Test
    public void loginMethod() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crio-qkart-frontend-qa.vercel.app/");


        WebElement register = driver.findElement(By.xpath("//div[@class='css-vb6e92']/button[text()='Register']"));




    }
}
