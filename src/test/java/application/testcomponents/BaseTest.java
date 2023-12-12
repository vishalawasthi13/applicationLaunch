package application.testcomponents;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;


    public WebDriver initializeDriver()  {


        String browserName = "chrome";
        if (browserName.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
           // driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {

        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
        return  driver;
    }

}



/*Note  :
public: This variable has public access, meaning it can be accessed from other classes.
static: Indicates that the variable belongs to the class itself, not to specific instances of the class.
        This means there will be only one instance of driver shared across all instances of the class.
 WebDriver: Specifies the data type of the variable. In this case, it's of type WebDriver, which is commonly used in Selenium for controlling web browsers.

implicitlyWait(Duration.ofSeconds(50)) :  the WebDriver to wait for a certain amount of time when trying to find an element if it's not immediately available.
window().maximize() :  WebDriver to maximize the browser window that it's controlling.


What the above code does ?


Declaration:

public WebDriver initializeDriver() throws IOException {: This method returns a WebDriver object and declares that it may throw an IOException.
Initialization based on browserName:

String browserName = "chrome";: Initializes a browserName variable with the value "chrome". You can modify this value to select a different browser.
if (browserName.equalsIgnoreCase("chrome")) { ... }: Checks if browserName is "chrome" (case-insensitive).
Inside the if block:
driver = new ChromeDriver();: If the browserName is "chrome", it initializes a ChromeDriver instance and assigns it to the driver variable.
Similar logic could be added for other browsers like Firefox or Edge within their respective else if blocks. Currently, these blocks are empty.
WebDriver Configuration:

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));: Sets an implicit wait time of 50 seconds for the driver to search for elements. This means the driver will wait for up to 50 seconds for elements to become available before throwing a NoSuchElementException.
driver.manage().window().maximize();: Maximizes the browser window controlled by the driver.
Return Statement:

return driver;: Returns the initialized WebDriver (driver) after configuring it based on the selected browser.
 */

