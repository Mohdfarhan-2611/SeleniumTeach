package org.example.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Hidden {


    @Test
    public void hiddenDropdownExample(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("Hacker@4321");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();


        WebElement dropDown = driver.findElement(By.xpath("//label[text()='Job Title']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text oxd-select-text--active']"));
        dropDown.click();

        WebElement dropDownOption = driver.findElement(By.xpath("//div[@role='option']/span[text()='manual testing']"));
        dropDownOption.click();


    }

}
