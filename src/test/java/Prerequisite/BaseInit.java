package Prerequisite;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseInit {

    public static Properties prop;
    public static WebDriver driver;

    // Method to initialize the WebDriver and load the properties
    public static void startUP() throws IOException {
        // Initialize the properties object
        prop = new Properties();

        // Load the properties file
        FileInputStream fi = new FileInputStream("C:\\Users\\289634\\Selenium Document\\Advance_Automation\\IE\\src\\test\\java\\Utility\\GeneralMethod.java");
        prop.load(fi);

        // Ensure browser configuration is available
        String browserVal = prop.getProperty("browser");
        assertNotNull(browserVal, "No browser defined in the properties file");

        // Set up the WebDriver based on the browser value
        if (browserVal.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserVal.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Unsupported browser specified in the properties file: " + browserVal);
        }

        // Ensure the URL is present in the properties file
        String url = prop.getProperty("url");
        assertNotNull(url, "No URL defined in the properties file");

        // Initialize the WebDriver settings
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    // Utility method to locate elements based on properties
    public static WebElement isElementPresent(String propKey) {
        try {
            String locator = prop.getProperty(propKey);
            assertNotNull(locator, "Locator not found in properties file for key: " + propKey);

            WebElement element = null;

            // Find the element based on its locator type (XPath, ID, etc.)
            if (propKey.contains("xpath")) {
                element = driver.findElement(By.xpath(locator));
            } else if (propKey.contains("id")) {
                element = driver.findElement(By.id(locator));
            } else if (propKey.contains("LinkText")) {
                element = driver.findElement(By.linkText(locator));
            } else if (propKey.contains("name")) {
                element = driver.findElement(By.name(locator));
            } else {
                throw new RuntimeException("Unsupported locator type for key: " + propKey);
            }

            assertNotNull(element, "Element not found for key: " + propKey);
            return element;

        } catch (Exception e) {
            throw new RuntimeException("Error while finding element using " + propKey + ": " + e.getMessage(), e);
        }
    }
}
