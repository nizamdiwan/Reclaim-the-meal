package com.ReclaimTheMeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loginpage_test {

    public String base_url = "http://localhost:8080/custom_login_url";
    String driver_path = "chromedriver.exe";
    public WebDriver driver;


    WebElement email;
    WebElement password;
    WebElement login_button;


    @BeforeTest
    public void init_data() {

        System.setProperty("web-driver.chrome.driver", "C:\\Users\\Nizam\\OneDrive\\Desktop\\project\\final 20-7\\chromedriver.exe");
        driver = new ChromeDriver();

        // find input elements in the page
        driver.get(base_url);
        email = driver.findElement(By.id("exampleFormControlInput3"));
        password = driver.findElement(By.id("exampleFormControlInput4"));
        login_button = driver.findElement(By.cssSelector("input[value = 'Login']"));

    }



    @Test(priority = 0)
    public void Correct_data() throws InterruptedException {
// enter all data in it's valid form

        String expected_url = "http://localhost:8080/posts";

        // driver.get("http://localhost:8080");
        email.sendKeys("jankipu@9gmail.com");
        password.sendKeys("janki2022");
        login_button.click();
        // TimeUnit.SECONDS.sleep(5);
        driver.navigate().to("http://127.0.0.1:8080/");
        driver.navigate().forward();
        //String actual_url = driver.getCurrentUrl();
        //Assert.assertNotEquals(actual_url, expected_url);
        TimeUnit.SECONDS.sleep(5);

    }


    @Test (priority = 2)
    public void check_email_01() throws InterruptedException {
        init_data();
        email.sendKeys("aatest@gmail.com");
        password.sendKeys("$2a$10$J.0TqsHqA7S2orJFwTzZ/.agkOCTSMnVJSL.o8yOzeS3aX8ZNvjzq");
        login_button.click();
        TimeUnit.SECONDS.sleep(1);
       // driver.navigate().to("http://127.0.0.1:8080/register");
        //TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
       // Assert.assertEquals(actual_url, base_url);
    }

    @Test (priority = 3)
    public void check_email_02() throws InterruptedException {
        init_data();
        email.sendKeys("as@s.com");
        password.sendKeys("test22022");
        login_button.click();
        TimeUnit.SECONDS.sleep(1);
        //driver.navigate().to("http://127.0.0.1:8080/register");
        //TimeUnit.SECONDS.sleep(5);
        //String actual_url = driver.getCurrentUrl();
        //Assert.assertEquals(actual_url, base_url);
    }


    @Test (priority = 4)

    public void check_email_03() throws InterruptedException {
        init_data();
        email.sendKeys("abcd@test.com");
        password.sendKeys("checkpassword");
        login_button.click();
        TimeUnit.SECONDS.sleep(1);
        //driver.navigate().to("http://127.0.0.1:8080/register");
        //TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, base_url);
    }

    @AfterMethod
    private void close_window() {
        // TODO Auto-generated method stub
        driver.close();
    }
        @AfterTest                            //Jumbled
        public void terminateBrowser () {
            driver.close();
            driver.quit();
        }

    }
