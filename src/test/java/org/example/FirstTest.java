package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    public ChromeDriver driver;

        @Test
        public void firstTest () {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\chromedriver.exe");
            driver = new ChromeDriver();
            // для всех тестов будет загружаться драйвер
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            driver.get("https://www.google.com/"); //открывает страницу гугл
            WebElement poisK = driver.findElement(By.xpath("//input[@title='Поиск']"));
            WebElement Input = driver.findElement(By.xpath("//input[@value='Поиск в Google']"));
            poisK.sendKeys("Калькулятор");
            Input.click();
            WebElement open = driver.findElement(By.xpath("//div[@class='z7BZJb XSNERd']"));
            open.click();
            WebElement a = driver.findElement(By.xpath("//div[@aria-label='открывающая скобка']"));
            a.click();
            WebElement b = driver.findElement(By.xpath("//div[@jsname='N10B9']"));
            b.click();
            WebElement c = driver.findElement(By.xpath("//div[@aria-label='сложение']"));
            c.click();
            WebElement d = driver.findElement(By.xpath("//div[@jsname='lVjWed']"));
            d.click();
            WebElement e = driver.findElement(By.xpath("//div[@aria-label='закрывающая скобка']"));
            e.click();
            WebElement f = driver.findElement(By.xpath("//div[@aria-label='умножение']"));
            f.click();
            WebElement g = driver.findElement(By.xpath("//div[@jsname='KN1kY']"));
            g.click();
            WebElement h = driver.findElement(By.xpath("//div[@aria-label='вычитание']"));
            h.click();
            WebElement l = driver.findElement(By.xpath("//div[@jsname='xAP7E']"));
            l.click();
            WebElement o = driver.findElement(By.xpath("//div[@jsname='bkEvMb']"));
            o.click();
            WebElement q = driver.findElement(By.xpath("//div[@aria-label='деление']"));
            q.click();
            WebElement x = driver.findElement(By.xpath("//div[@jsname='Ax5wH']"));
            x.click();
            WebElement ent = driver.findElement(By.xpath("//div[@aria-label='равно']"));
            ent.click();

            driver.quit();

        }

    }

