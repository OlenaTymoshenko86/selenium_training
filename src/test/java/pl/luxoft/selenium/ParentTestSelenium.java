package pl.luxoft.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class ParentTestSelenium {


    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }
        @AfterTest
        public void TeamDown () {
            driver.quit();
        }
    }