package org.example.RedBus;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class RedbusAutomationAssignment {


    @Test
    public void testAssignment() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);

        //launch redbus
        driver.get("https://redbus.in");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //click from destination
        WebElement fromDestination = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'srcDestWrapper') and @role='button']")));
        fromDestination.click();


        WebElement searachText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'searchSuggestion')]")));
        WebElement fromText = driver.switchTo().activeElement();
        fromText.sendKeys("Mumbai");


        List<WebElement> searchList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'searchCategory')]//div[contains(@class,'listHeader')]")));
        for (WebElement element : searchList) {
            try {
                if (element.getText().equals("Agra")) {
                    element.click();
                }
            }catch (StaleElementReferenceException e){
                System.out.println(e.getMessage());
            }

        }


        WebElement toElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inputsWrapper')]/div[2]")));
        toElement.click();

        WebElement searachText2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'suggestionsWrapper')]")));
        WebElement toText = driver.switchTo().activeElement();
        toText.sendKeys("Jaipur");







    }
}

