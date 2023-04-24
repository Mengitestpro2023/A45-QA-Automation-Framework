import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import  org.testng.annotations.Test;

import java.time.Duration;

public class TestHomeWorkToDo extends BaseTest{

@Test
    public void registerNavig(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);
        String urlRegister="https://bbb.testpro.io/registration.php";

        WebElement registerField=driver.findElement(By.cssSelector("a[id='hel']"));
        registerField.click();
        Assert.assertEquals(driver.getCurrentUrl(),urlRegister);
        driver.quit();



    }
}
