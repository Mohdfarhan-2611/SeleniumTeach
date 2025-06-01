package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Navigation {


    @Test
    public void navigateMethod() throws InterruptedException, MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
//        Thread.sleep(2000);
//        driver.navigate().to("https://testautomationpractice.blogspot.com/");
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        System.out.println("refresh");
//        Thread.sleep(2000);
//        driver.navigate().back();
//        System.out.println("Move backed");
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        System.out.println("Move forward");


        //get and navigate to()
        //1. driver.get()=> Only in string format
        URL url = new URL("https://google.com");
        driver.navigate().to(url);


        //2. Internally get method is gtting called.
        //driver.navigate().to("");

        driver.close();   //Current window only will close
        driver.quit();    //all windows open will get close


    }


}
