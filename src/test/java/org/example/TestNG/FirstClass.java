package org.example.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstClass {


    @Test(description = "verify test01")
    public void test01() {

        Assert.assertEquals(1,2);
        Assert.assertEquals("Farhan", "Farhan");
        System.out.println("Test01");


    }

    @Test(description = "verify test02")
    public void test02() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,2);
        softAssert.assertTrue(true);
        softAssert.assertEquals("farhan", "farhan2");
        System.out.println("Test02");
        softAssert.assertAll(); //mandotory print all error

    }


    @Test(description = "verify test03")
    public void test03() {

        System.out.println("Test03");

    }












}