package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crio-qkart-frontend-qa.vercel.app/login");

//        //Locators are stores in which class?
//        //id
//        driver.findElement(By.id("username")).sendKeys("Farhan");
//
//        //name
//        driver.findElement(By.name("password")).sendKeys("Password");
//
//      //  LinkText
//      WebElement element =  driver.findElement(By.linkText("Privacy policy"));
//      element.click();
//
//        //PartialLinkText
//        driver.findElement(By.partialLinkText("Privacy")).click();
//
//
//       //Tagname
//      List<WebElement> inputtext  =  driver.findElements(By.tagName("img"));
//      inputtext.get(0).sendKeys("Farhan");
//      inputtext.get(1).sendKeys("Password");



        driver.findElement(By.cssSelector("#username")).sendKeys("Farhan");

        WebElement element = driver.findElement(By.cssSelector(".title"));
        //System.out.println(element.getText());
        String title = element.getText();
        System.out.println(title);


        driver.findElement(By.cssSelector("[type='password']")).sendKeys("Password");




    }
}
