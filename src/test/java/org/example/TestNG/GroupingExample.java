package org.example.TestNG;

import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"regression", "smoke"})
    public void test01() {
        System.out.println("Test01");
    }

    @Test(groups = {"sanity"} )
    public void test02() {
        System.out.println("Test02");
    }


    @Test(groups = {"sanity"})
    public void test03() {

        System.out.println("Test03");

    }
}
