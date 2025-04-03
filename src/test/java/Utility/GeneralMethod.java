package Utility;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Prerequisite.BaseInit;

public class GeneralMethod extends BaseInit {

    // Random data for tests
    public static String audienceName = generateRandomAudienceName();
    public static String poNumber = generateRandomPONumber();
    public static String level = generateRandomLevel();
    public static String Username=getRandomUsername();

    // Method to generate a random audience name
    public static String generateRandomAudienceName() {
        Random random = new Random();
        int randomNumber = 10000 + random.nextInt(90000); // Generates a random number of length 5
        return "TestAudName" + randomNumber;
    }

    // Method to generate a random PO Number
    public static String generateRandomPONumber() {
        Random random = new Random();
        int randomNumber = 10000 + random.nextInt(90000); // Generates a random number of length 5
        return "AutoPO" + randomNumber;
    }

    // Method to generate a random Level
    public static String generateRandomLevel() {
        Random random = new Random();
        int randomNumber = 10000 + random.nextInt(90000); // Generates a random number of length 5
        return "AutoLevel" + randomNumber;
    }

    // Method to set the implicit wait
    public static void setImplicitWait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    // Method to apply Explicit Wait for an element to be visible
    public static WebElement waitForElementToBeVisible(WebDriver driver, By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Method to apply Explicit Wait for an element to be clickable
    public static WebElement waitForElementToBeClickable(WebDriver driver, By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
    
    // Helper method to get a random username (you can customize it)
    public static String getRandomUsername() {
        String[] usernames = {"JohnDoe", "JaneSmith", "MikeJones", "EmilyDavis"};
        Random random = new Random();
        return usernames[random.nextInt(usernames.length)];
    }

    // Helper method to get a random employee name (you can customize it)
    public static String getRandomEmployeeName() {
        String[] employeeNames = {"John Smith", "Emily Johnson", "David Brown", "Sarah Davis"};
        Random random = new Random();
        return employeeNames[random.nextInt(employeeNames.length)];
    }

      
    
    
    
}
