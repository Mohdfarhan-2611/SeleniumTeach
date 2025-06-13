package org.example.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownExample3_Bootstrap {



    @Test(priority = 0)
    public void dropdownSingleSelectExample() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        WebElement dropDownElement = driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]"));
        dropDownElement.click();

        WebElement inputCheckBox = driver.findElement(By.xpath("//input[@value='Java']"));
        inputCheckBox.click();

    }


    @Test(priority = 0)
    public void dropdownSizeExample() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        WebElement dropDownElement = driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]"));
        dropDownElement.click();

        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
        for(WebElement option : allOptions){
            System.out.println(option.getText());
        }

        for(WebElement option : allOptions){
            String value = option.getText();
            if(value.equals("Java") || value.equals("C#")){
                option.click();
                option.click();
            }
        }

        driver.quit();

    }

}
