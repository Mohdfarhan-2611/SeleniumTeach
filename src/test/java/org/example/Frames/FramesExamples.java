package org.example.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FramesExamples {


    @Test
    public void staticTableExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");

//        driver.switchTo().frame("name");
//        driver.switchTo().frame("id");
//        driver.switchTo().frame("WebElement");
//        driver.switchTo().frame("index");
//        driver.switchTo().defaultContent();

        //Frame1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        WebElement inputBox1 = driver.findElement(By.xpath("//input[@name='mytext1']"));
        inputBox1.sendKeys("Welcome");
        driver.switchTo().defaultContent();


        //Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        WebElement inputBox2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
        inputBox2.sendKeys("Welcome");
        driver.switchTo().defaultContent();


        //Frame 3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        WebElement inputBox3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
        inputBox3.sendKeys("Welcome");

        driver.switchTo().frame(0);

        WebElement radioHuman = driver.findElement(By.xpath("//span[text()='I am a human']/ancestor::div[@class='YEVVod']/preceding-sibling::div[@class='d7L4fc bJNwt  FXLARc aomaEc ECvBRb']//div[@class='vd3tt']"));
        radioHuman.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(frame3);
        inputBox3.clear();



    }
}
