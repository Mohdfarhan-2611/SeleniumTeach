package org.example.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {


    @Test(dependsOnMethods = "test02", alwaysRun = true)
    public void test01() {

        System.out.println("Test01");

    }

    @Test()
    public void test02() {

        Assert.assertTrue(false);
        System.out.println("Test02");

    }

}
