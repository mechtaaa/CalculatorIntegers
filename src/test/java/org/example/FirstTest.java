package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class FirstTest{
    public ChromeDriver driver;
    public СalculatorPage cal;


    @Test
        public void firstTest () {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\chromedriver.exe");
        driver = new ChromeDriver();
        // для всех тестов будет загружаться драйвер
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/"); //открывает страницу гугл
        cal= new СalculatorPage(driver);
        cal.writeText("Калькулятор");
        cal.clickKnopky();
        cal.clic();
        cal.clicKnopkyb();
        cal.clicKnopkyc();
        cal.clicKnopkyd();
        cal.clicer();
        cal.clicKnopkyf();
        cal.clicKnopkyg();
        cal.clicKnopkyq();
        cal.clicKnopkyl();
        cal.clicKnopkyo();
        cal.clicKnopkyk();
        cal.clicKnopkym();
        cal.clicKnopkyent();
        driver.quit();
    }

    }

