package testscenarios;


import application.testcomponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class demoApplicatonScenarioThree extends BaseTest {


    @BeforeClass
    public void homePage() {

        driver = initializeDriver();
        String baseURL = "https://demo.guru99.com/test/guru99home/";

        driver.get(baseURL);
        System.out.println("Account Open");

    }


    @Test
    public void detailCourse() {

        driver.get("https://demo.guru99.com/test/guru99home/");

        //Search element inside 'Popular course' which are sibling of control 'SELENIUM' ,Here first we will find a h2 whose text is ''A few of our most popular courses' ,then we move to its parent element which is a 'div' , inside this div we will find a link whose text is 'SELENIUM' then at last we will find all of the sibling elements of this link('SELENIUM')


        List<WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));

        //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
        for (WebElement webElement : dateBox) {
            System.out.println(webElement.getText());
        }


    }


    @AfterClass
    public void tearDown() {

        driver.quit();
    }


}



/*
List<WebElement> is a generic type in Java that represents a collection of elements.
In this code, it is used to store the list of web elements returned by the findElements() method of the WebDriver object.
Each element in the list represents a specific HTML element on the web page.



This code is iterating through each element in the dateBox list and printing its text content using the getText() method.
The for loop iterates through each element in the dateBox list and assigns it to the webElement variable.
The : after the dateBox indicates that this is a for-each loop, which is a more concise way of iterating through a collection.
Inside the loop, the getText() method is called on the webElement to get its text content, which is then printed to the console using System.out.println().

*/
















