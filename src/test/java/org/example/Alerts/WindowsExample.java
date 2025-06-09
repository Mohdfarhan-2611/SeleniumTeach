package org.example.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class WindowsExample {


    @Test(description = "verify window popup")
    public void getWindowExample() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String firstWindowID = driver.getWindowHandle();
        System.out.println(firstWindowID);

        WebElement newTabButton = driver.findElement(By.xpath("//button[text()='New Tab']"));
        newTabButton.click();

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);

        for(String window : allWindows){
            if(!window.equals(firstWindowID)){
                driver.switchTo().window(window);

                WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
                searchBox.sendKeys("Farhan");

                WebElement seachbutton = driver.findElement(By.xpath("//input[@type='submit']"));
                seachbutton.click();
                driver.close();
            }

        }

        driver.switchTo().window(firstWindowID);
        driver.quit();

    }


}
