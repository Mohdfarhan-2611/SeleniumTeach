package org.example.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsExample {


    @Test
    public void mouseHoverExample(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement pointMeButton = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        WebElement laptopsOption = driver.findElement(By.xpath("//a[text()='Laptops']"));

        Actions act = new Actions(driver);
        act.moveToElement(pointMeButton).moveToElement(laptopsOption).build().perform();

    }


    @Test
    public void mouseHoverExample2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/accessories");
        WebElement apparelElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        WebElement accessoriesElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Accessories ']"));

        Actions act = new Actions(driver);
        act.moveToElement(apparelElement).moveToElement(accessoriesElement).click().build().perform();

    }


    @Test
    public void rightClickExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));
        WebElement copyElement = driver.findElement(By.xpath("//span[text()='Copy']"));
        Actions act = new Actions(driver);
        Action myact = act.contextClick(rightClickElement).build();
        myact.perform();
        driver.switchTo().alert().accept();

    }



    @Test
    public void doubleClickExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement copyTextElement = driver.findElement(By.xpath("//button[text()='Copy Text']"));
        WebElement field1 = driver.findElement(By.id("field1"));
        WebElement field2 = driver.findElement(By.id("field2"));
        Actions act = new Actions(driver);
        act.doubleClick(copyTextElement).perform();

        String text1 = field1.getAttribute("value");
        String text2 = field2.getAttribute("value");

        Assert.assertEquals(text1, text2);

    }



    @Test
    public void dragandDropExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);
        act.dragAndDrop(source,target).build().perform();

    }

    @Test
    public void sliderExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        Actions act = new Actions(driver);

        WebElement minSlider = driver.findElement(By.xpath("//span[@style='left: 0%;']"));
        System.out.println("Default location of slider: " + minSlider.getLocation()); //59, 249
        act.dragAndDropBy(minSlider, 100, 249).perform();
        System.out.println("Location of slider after moving: " + minSlider.getLocation());

        WebElement maxSlider = driver.findElement(By.xpath("//span[@style='left: 100%;']"));
        System.out.println("Default location of slider: " + maxSlider.getLocation());
        act.dragAndDropBy(maxSlider, -100, 249).perform();
        System.out.println("Location of slider after moving: " + maxSlider.getLocation());

    }


    @Test
    public void keyboardActionExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://text-compare.com/");
        Actions act = new Actions(driver);

        WebElement textBox1 = driver.findElement(By.xpath("//textarea[@name='text1']"));
        textBox1.sendKeys("Welcome");

        //Cntrol A
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();


        //Control c
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();


        //Control V
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

    }




    @Test
    public void keyboardActionExample2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Actions act = new Actions(driver);

        WebElement registerElement = driver.findElement(By.xpath("//a[text()='Register']"));
        //registerElement.click();

        act.keyDown(Keys.CONTROL).click(registerElement).keyUp(Keys.CONTROL).perform();

    }

}
