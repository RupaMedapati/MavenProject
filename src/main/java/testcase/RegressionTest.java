package testcase;

import org.testng.annotations.Test;

public class RegressionTest {
    @Test(dependsOnMethods = {"testcase.CreateLe.create","testcase.CreateLe.login"})
    public void edit(){
        System.out.println("editlead");
    }
}
