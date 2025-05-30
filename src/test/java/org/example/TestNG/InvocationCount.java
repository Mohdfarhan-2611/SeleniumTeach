package org.example.TestNG;

import org.testng.annotations.Test;

public class InvocationCount {

    @Test(invocationCount = 3)
    public void test01() {

        System.out.println("Test01");

    }
}
