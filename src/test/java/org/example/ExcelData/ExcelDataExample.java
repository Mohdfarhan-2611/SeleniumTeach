package org.example.ExcelData;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.*;
import java.time.Duration;
import java.util.Iterator;

public class ExcelDataExample {


    @Test
    public void enterTextExample() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        File file = new File(System.getProperty("user.dir")+"/src/test/java/org/example/ExcelData/AutomationTestDataFromExcel.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("TestData");

        Iterator<Row> rowIterator=sheet.iterator();
        rowIterator.next();  //Skip my first header row
        Row row;
        Cell nameCell = null;
        Cell emailCell = null;
        Cell phoneCell = null;

        while(rowIterator.hasNext()){
            row = rowIterator.next();
            nameCell = row.getCell(0);
            emailCell = row.getCell(1);
            phoneCell = row.getCell(2);

        }


        String name= nameCell.toString();
        String email = emailCell.toString();
        String phone = phoneCell.toString();

        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);


        WebElement nameElement = driver.findElement(By.id("name"));
        WebElement emailElement = driver.findElement(By.id("email"));
        WebElement phoneElement = driver.findElement(By.id("phone"));

        nameElement.sendKeys(name);
        emailElement.sendKeys(email);
        phoneElement.sendKeys(phone);

        workbook.close();
        fis.close();
        driver.quit();
    }
}
