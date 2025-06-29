package org.example.Frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesExamples {


    @Test
    public void staticTableExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.switchTo().frame("name");
        driver.switchTo().frame("id");
        driver.switchTo().frame("WebElement");
        driver.switchTo().frame(0);

        WebElement click = driver.findElement("");

        driver.switchTo().defaultContent();

    }
}
