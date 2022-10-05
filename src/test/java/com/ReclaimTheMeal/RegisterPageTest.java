/*package com.ReclaimTheMeal;

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

public class RegisterPageTest {

    public String base_url = "http://localhost:8080/register";
    String driver_path = "chromedriver.exe";
    public WebDriver driver;

    WebElement first_name ;
    WebElement last_name ;
    WebElement email ;
    WebElement password;
    WebElement sign_up_button ;


    @BeforeTest
    public void init_data() {

        System.setProperty("web-driver.chrome.driver","C:\\Users\\Nizam\\OneDrive\\Desktop\\project\\final 20-7\\chromedriver.exe");
        driver = new ChromeDriver();
        // find input elements in the page
        driver.get(base_url);
        first_name = driver.findElement(By.id("exampleFormControlInput1"));
        last_name = driver.findElement(By.id("exampleFormControlInput2"));
        email = driver.findElement(By.id("exampleFormControlInput3"));
        password = driver.findElement(By.id("exampleFormControlInput4"));
        sign_up_button = driver.findElement(By.cssSelector("input[value = 'Register']"));
    }

    @AfterMethod
    private void close_window() {
        // TODO Auto-generated method stub
        driver.close();
    }

    @Test (priority = 0)
    public void all_valid_data() throws InterruptedException {

        String expected_url = "https://www.phptravels.net/account/";
        // enter all data in it's valid form
        first_name.sendKeys("Test");
        last_name.sendKeys("Name");
        email.sendKeys("valid_data@test.com");
        password.sendKeys("P@$$W0rd");
        sign_up_button.click();
        TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, expected_url);
    }

    @Test (priority = 1)
    public void frist_name() throws InterruptedException {
        init_data();
        first_name.sendKeys("mohamed");
        last_name.sendKeys("Adel");
        email.sendKeys("firstname@test.com");
        password.sendKeys("P@$$W0rd");
        sign_up_button.click();
        TimeUnit.SECONDS.sleep(5);
        String expected_title ="Register";
        String actual_title = driver.getTitle();
        Assert.assertEquals(actual_title, expected_title);
    }

    @Test (priority = 2)

    private void last_name_1() throws InterruptedException {
        init_data();
        first_name.sendKeys("Firstname");
        last_name.sendKeys("lastname");
        email.sendKeys("lastname@test.com");
        password.sendKeys("P@$$W0rd");
        sign_up_button.click();
        TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, base_url);
    }

    @Test (priority = 3)
    private void last_name_2() throws InterruptedException {
        init_data();
        first_name.sendKeys("Test");
        last_name.sendKeys("Test");
        email.sendKeys("lastname0@xyz.com");
        password.sendKeys("P@$$W0rd");
        sign_up_button.click();
        TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, base_url);
    }

    @Test (priority = 4)
    public void check_email() throws InterruptedException {
        init_data();
        first_name.sendKeys("mohamed");
        last_name.sendKeys("adel");
        email.sendKeys("email");
        password.sendKeys("P@$$W0rd");
        sign_up_button.click();
        TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, base_url);
    }

    @Test (priority = 5)
    public void check_password_1() throws InterruptedException {
        init_data();
        first_name.sendKeys("First");
        last_name.sendKeys("Second");
        email.sendKeys("password@test.com");
        password.sendKeys("123456");
        sign_up_button.click();
        TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, base_url);
    }

    @Test (priority = 6)
    public void check_password_2() throws InterruptedException {
        init_data();
        first_name.sendKeys("First");
        last_name.sendKeys("Second");
        email.sendKeys("password2@test.com");
        password.sendKeys("password");
        sign_up_button.click();
        TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, base_url);
    }

    @Test (priority = 7)
    public void check_password_3() throws InterruptedException {
        init_data();
        first_name.sendKeys("First");
        last_name.sendKeys("Second");
        email.sendKeys("password3@test.com");
        password.sendKeys("123456789");
        sign_up_button.click();
        TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, base_url);
    }

    @Test
    public void use_registered_email() throws InterruptedException {
        init_data();
        first_name.sendKeys("Test");
        last_name.sendKeys("Name");
        email.sendKeys("valid_data@test.com");
        password.sendKeys("P@$$W0rd");
        sign_up_button.click();
        TimeUnit.SECONDS.sleep(5);
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, base_url);
    }

    @AfterTest                            //Jumbled
    public void terminateBrowser(){
        driver.close();
        driver.quit();
    }

}

 */