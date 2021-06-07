package testcase;

import org.testng.annotations.*;

public class MultipleTestCases {
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
   // @Test
    //public void test3(){
     //   System.out.println("test3");
    //}
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforemet");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("aftermet");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeclass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterclass");
    }
}
