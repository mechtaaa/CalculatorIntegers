package org.example;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class FirstTest extends Settings {
    @Test
        public void firstTest() {
        calculatorPage= new СalculatorPage(driver);
        calculatorPage.writeText("Калькулятор");
        calculatorPage.clickButton();
        calculatorPage.clickCalculators();
        String result = driver.findElement(By.xpath("//span[@class='qv3Wpe']")).getText();
        Assert.assertEquals(result, calculatorPage.check());
    }
    @Test
    public void firstTest2(){
        calculatorPage = new СalculatorPage(driver);
        calculatorPage.writeText2("Калькулятор");
        calculatorPage.clickButton2();
        calculatorPage.clickCalculators2();
        String result2 = driver.findElement(By.xpath("//span[@class='qv3Wpe']")).getText();
        Assert.assertEquals(result2, calculatorPage.check2());
    }
    @Test
    public void firstTest3(){
        calculatorPage = new СalculatorPage(driver);
        calculatorPage.writeText3("Калькулятор");
        calculatorPage.clickButton3();
        calculatorPage.clickCalculators3();
        String result3 = driver.findElement(By.xpath("//span[@class='qv3Wpe']")).getText();
        Assert.assertEquals(result3, calculatorPage.check3());
    }
    }