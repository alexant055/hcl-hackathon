package org.hackathon.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hackathon.config.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Base {
    public static WebDriver driver;
    private ConfigFileReader configFileReader;
    public static Actions actions;

    public Base() {
        configFileReader = new ConfigFileReader();

        switch (configFileReader.getBrowser()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                System.out.println("Chrome is the only supported browser.");
        }

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configFileReader.getImplicitlyWait()));
        driver.manage().deleteAllCookies();
        driver.get(configFileReader.getApplicationUrl());

        actions = new Actions(driver);
    }

    public  void closeDriver() {
        driver.close();
        driver.quit();
    }
}
