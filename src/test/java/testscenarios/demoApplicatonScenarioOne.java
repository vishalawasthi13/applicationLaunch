package testscenarios;


import application.testcomponents.BaseTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;


public class  demoApplicatonScenarioOne extends BaseTest  {


    @BeforeMethod
    public void homePage() {

        driver =  initializeDriver();
        String baseURL = "https://www.saucedemo.com/";
        //String baseURL = "file:///C:/Users/DELL/Desktop/testingppt.html";
        driver.get(baseURL);
        System.out.println("Account Open");

    }



    @Test
    public void checkPath( )  {


        String actualMessage = "Testing Try Catch";
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/input")).click();
        String erroMessage = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(actualMessage,erroMessage);











       /* String actualErrorMessage = "Epic sadface: Username is required";
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/input")).click();
        String errorMessage = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(actualErrorMessage,errorMessage);*/



    }



    @AfterMethod
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















