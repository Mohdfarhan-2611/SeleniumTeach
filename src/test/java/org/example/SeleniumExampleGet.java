package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SeleniumExampleGet {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com"); // Argument in Stringformat
        String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        String sessionID = driver.getWindowHandle();
        System.out.println(sessionID);

        Set<String> sessionIDs =  driver.getWindowHandles();
        for(String id : sessionIDs){
           System.out.println(id);
       }


    }
}
