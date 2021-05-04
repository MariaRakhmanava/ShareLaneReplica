package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {
    @Test
    public void fillZipCodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("75204");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
    }

    @Test
    public void registrationPositiveTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=123456");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("last_name")).sendKeys("Stone");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("ijkl890%");
        driver.findElement(By.name("password2")).sendKeys("ijkl890%");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }

    @Test
    public void registrationAllEmptyFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=123456");
        driver.findElement(By.name("first_name")).sendKeys("");
        driver.findElement(By.name("last_name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("password1")).sendKeys("");
        driver.findElement(By.name("password2")).sendKeys("");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }

}
