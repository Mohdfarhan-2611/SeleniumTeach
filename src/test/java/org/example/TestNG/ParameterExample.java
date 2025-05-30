package org.example.TestNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

    @Parameters("browser")
    @Test
    public void openBrowser(String value) {
        System.out.println("Browser is "+value);
        if(value.equals("chrome")){
            System.out.println("Start chrome");
        }
    }

}
