package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleWebTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/table.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        List<WebElement> count=driver.findElementsByXPath("//table[@id='table_id']//tr/th");
        System.out.println("count of columns "+count.size());
        List<WebElement> countRows=driver.findElementsByXPath("//table[@id='table_id']//tr");
        System.out.println("count of rows "+countRows.size());
        Thread.sleep(3000);
        //go to row3 and fetch all values and store in arraylist
        List<WebElement> row3Value=driver.findElementsByXPath("//table[@id='table_id']//tr[3]/td");
        List<String> hs=new ArrayList();
        for(int i=1;i<=row3Value.size();i++){
            String eachValueFromRow=driver.findElementByXPath("//table[@id='table_id']//tr[3]/td["+i+"]").getText();
            hs.add(eachValueFromRow);
        }
        if(hs.get(0).equals("Learn to interact with Elements")){
            System.out.println(row3Value.get(1).getText());
        }
List<WebElement> progressValues= driver.findElementsByXPath("//table[@id='table_id']//tr/td[2]");
        ArrayList<Integer> as=new ArrayList<>();
        for(int i=2;i<=progressValues.size()+1;i++){
            String eachProgressValue=driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[2]").getText();
            String resString=eachProgressValue.replaceAll("%","").trim();
            int resValue=Integer.parseInt(resString);
            as.add(resValue);
        }
       int num= Collections.min(as);
        int index=as.indexOf(num);
        System.out.println(index);
        driver.findElementByXPath("//table[@id='table_id']//tr["+(index+2)+"]/td["+(index+1)+"]/input").click();



    }
}
