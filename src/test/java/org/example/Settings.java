package org.example;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Settings {
    public ChromeDriver driver;
    public СalculatorPage calculatorPage;
        @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\chromedriver.exe");
            driver = new ChromeDriver();
            // для всех тестов будет загружаться драйвер
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.google.com/");
            calculatorPage= new СalculatorPage(driver);
        }
        @After
        public void close(){
            driver.quit();
        }
    }