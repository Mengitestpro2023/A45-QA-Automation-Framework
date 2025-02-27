import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {

      @Test
    public void loginInvalidPasswordTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);

        WebElement emailField=driver.findElement(By.cssSelector("input[type='email']"));
        //emailField.click();
        emailField.clear();
        emailField.sendKeys("mengi.gebremedhin@testpro.io");
        WebElement passwordField=driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("te$t$tudent");
        WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();
        WebElement avatarIcon=driver.findElement(By.cssSelector("img[class='avatar']"));
        Assert.assertEquals(driver.getCurrentUrl(),url);
        driver.quit();


    }

    @Test
    public void loginInvalidEmailTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);

        WebElement emailField=driver.findElement(By.cssSelector("input[type='email']"));
        //emailField.click();
        emailField.clear();
        emailField.sendKeys("invalid@testpro.io");
        WebElement passwordField=driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("te$t$tudent");
        WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();
        WebElement avatarIcon=driver.findElement(By.cssSelector("img[class='avatar']"));
        Assert.assertEquals(driver.getCurrentUrl(),url
        );
        //driver.quit();


    }




    @Test
    public void loginEmailPasswordTest(){
        //      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);

        WebElement emailField=driver.findElement(By.cssSelector("input[type='email']"));
        //emailField.click();
        emailField.clear();
        emailField.sendKeys("mengi.gebremedhin@testpro.io");
        WebElement passwordField=driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("te$t$tudent");
        WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();
        WebElement avatarIcon=driver.findElement(By.cssSelector("img[class='avatar']"));
        Assert.assertEquals(avatarIcon.isDisplayed(),true);
        //driver.quit();
    }







    @Test
    public static void LoginEmptyEmailPasswordTest() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
}
