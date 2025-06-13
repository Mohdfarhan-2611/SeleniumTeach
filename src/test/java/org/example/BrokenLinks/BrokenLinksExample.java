package org.example.BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenLinksExample {

    @Test(priority = 0)
    public void brokenLinksExample() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement brokenElement = driver.findElement(By.xpath("//a[text()='Errorcode 400']"));
        String linkhref = brokenElement.getAttribute("href");

        URL urlLink = new URL(linkhref);

        HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();
        connection.connect();

        if(connection.getResponseCode()>=400){
            System.out.println("it is a broken link");
        }else{
            System.out.println("it is not a broken link");
        }






    }

}
