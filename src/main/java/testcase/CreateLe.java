package testcase;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class CreateLe {
    @Test
    public void login(){
        System.out.println("login");
    }
    @Test(invocationCount = 2)
    public void create(){
        System.out.println("create lead");
        //throw new NoSuchElementException();
    }
    @Test(priority=2)
    public void edit(){
        System.out.println("edit lead");
    }
    @Test(priority=3)
    public void delete(){
        System.out.println("delete lead");
    }
    @Test(priority = 1)
    public void merge(){
        System.out.println("merge lead");
    }
}
