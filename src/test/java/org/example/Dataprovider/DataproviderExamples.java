package org.example.Dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataproviderExamples {


    @Test(dataProvider = "getTestData2")
    public void readData(String name, String email, String phone){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement nameElement = driver.findElement(By.id("name"));
        WebElement emailElement = driver.findElement(By.id("email"));
        WebElement phoneElement = driver.findElement(By.id("phone"));

        nameElement.sendKeys(name);
        emailElement.sendKeys(email);
        phoneElement.sendKeys(phone);

    }


    @DataProvider
    public Object[][] getTestData1(){
        return new Object[][]{
                {"Farhan", "farhan1@gamil.com", "9876543210"},
                {"Tayyab", "tayaab1@gamil.com", "1234567890"}
        };
    }

    @DataProvider
    public Iterator<Object[]> getTestData2(){
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Tester", "Tester@gmail.com", "2345" });
        data.add(new Object[]{"Devloper", "Developer@gmail.com", "98765"});

        return data.iterator();
    }

    //Dataprovider returns 3 things
    //1 Object[]
    //2 Object[][]
    //3 Iterator<Object[]>


     //2D Array
    //int[][] obj = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
    // return obj;
    // return new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};

    //Array
    //int[] obj = new int[2]
    //obj[0]=1
    //obj[1]=2
    //int[] obj = {1,3,3,4,5}
    //int[] obj = new int[]{4,5,6,7};


    //List<Object>
    //List<Object[]> data = new ArrayList<>();
    //return data.iterator();


}

