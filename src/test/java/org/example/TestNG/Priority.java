package org.example.TestNG;

import org.testng.annotations.Test;

public class Priority {


    @Test(description = "verify test01", priority = 1)
    public void test01() {

        System.out.println("Test01");

    }

    @Test(dependsOnMethods = "test03", alwaysRun = true)
    public void test02() {

        System.out.println("Test02");

    }


    @Test(enabled = true)
    public void test03() {

        System.out.println("Test03");

    }
}
