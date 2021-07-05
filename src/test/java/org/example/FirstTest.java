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
        Assert.assertEquals(calculatorPage.getAnswer(), "1");
    }
    @Test
    public void firstTest2(){
        calculatorPage = new СalculatorPage(driver);
        calculatorPage.writeText2("Калькулятор");
        calculatorPage.clickButton2();
        calculatorPage.clickCalculators2();
        Assert.assertEquals(calculatorPage.getAnswer2(), "Infinity");
    }
    @Test
    public void firstTest3(){
        calculatorPage = new СalculatorPage(driver);
        calculatorPage.writeText3("Калькулятор");
        calculatorPage.clickButton3();
        calculatorPage.clickCalculators3();
        Assert.assertEquals(calculatorPage.getAnswer3(), "Error");
    }
    }