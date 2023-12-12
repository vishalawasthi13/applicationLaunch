package testscenarios;

import application.testcomponents.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ApplicationLaunch extends BaseTest {

    @Test
    public void landingPage() {

        driver = initializeDriver();
        String baseUrl = "https://www.saucedemo.com";
        driver.get(baseUrl);
        System.out.println("application is installed");
    }

    //absolute x path
    @Test
    public void loginErrorMsg(){
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/input")).click();
        String actualMessage = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/h3")).getText();
        String msg="Epic sadface: Username is required";
        Assert.assertEquals(actualMessage, msg);
    }

    @Test
    public void loginSauceDemo(){
        //username
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
        //password
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        //login button click
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title']")));
        String text = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(text,"Products");

      /*  List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        for(int i =0 ; i < productList.size(); i++){
            String producName = productList.get(i).getText();
            System.out.println(producName);
        }*/
    }


    //finding the elements of complete list
    @Test
    public void findListOfProduct(){
        // List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));

        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        for(int i =0 ; i < productList.size(); i++){
            String producName = productList.get(i).getText();
            System.out.println(producName);
        }
    }
}

/*

 List<WebElement>  productNewList = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
       // List<WebElement>  productPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (int i = 0; i < productNewList.size(); i++) {
          String clothName = productNewList.get(i).getText();
           //String clothPrice = productPrice.get(i).getText();
            System.out.println(i);
        }
 */