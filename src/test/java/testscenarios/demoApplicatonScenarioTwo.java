package testscenarios;


import application.testcomponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.desktop.SystemEventListener;
import java.time.Duration;
import java.util.List;


public class demoApplicatonScenarioTwo extends BaseTest  {


    @BeforeClass
    public void homePage() {

        driver =  initializeDriver();
        String baseURL = "https://www.saucedemo.com/";
        driver.get(baseURL);
        System.out.println("Account Open");

    }



    @Test
    public void checkWaitforElement( ) {


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //ExplicitWait
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()))
*/


        //Text
        String headerName = driver.findElement(By.xpath("//*[text()='Products']")).getText();
        System.out.println(headerName);

        //Contains
        String productName = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).getText();
        System.out.println(productName);

        //List
    }
        @Test
        public void  checkProductName() {
        List<WebElement>  productNewList = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
       // List<WebElement>  productPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (int i = 0; i < productNewList.size(); i++) {
          String clothName = productNewList.get(i).getText();
           //String clothPrice = productPrice.get(i).getText();
            System.out.println(i);
        }

        System.out.println("*****************************************************************");
/*
        //Select
        Select productPriceList =  new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        productPriceList.selectByVisibleText("Price (high to low)");

        //Assignment
        List<WebElement>  productNewListFilter = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        List<WebElement>  productPriceFilter = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (int i = 0; i < productNewListFilter.size(); i++) {
            String clothNameNew = productNewListFilter.get(i).getText();
            String clothPriceNew = productPriceFilter.get(i).getText();
            System.out.println(clothNameNew + " - " + clothPriceNew);
        }



*/
        }







    @AfterClass
    public void tearDown() {

       driver.quit();
    }












   /*@Test
        public void landingPage() throws IOException, InterruptedException {

         driver = initializeDriver();
         String baseURL = "https://www.saucedemo.com/";
         driver.get(baseURL);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

         System.out.println("Account Login");
   }*/
}















