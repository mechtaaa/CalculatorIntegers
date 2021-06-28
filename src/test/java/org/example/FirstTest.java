package org.example;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends Settings {
    @Test
        public void firstTest() {
        calculatorPage= new СalculatorPage(driver);
        calculatorPage.writeText("Калькулятор");
        calculatorPage.clickButton();
        calculatorPage.clickCalculators();
        calculatorPage.LocatorIsGood(1);
        Assert.assertEquals(calculatorPage.LocatorIsGood(1), 1 );

    }
    @Test
    public void firstTest2(){
        calculatorPage2 = new CalculatorPage2(driver);
        calculatorPage2.writeText2("Калькулятор");
        calculatorPage2.clickButton2();
        calculatorPage2.clickCalculators2();
        calculatorPage2.LocatorIsBad("Infinity");
        Assert.assertEquals(calculatorPage2.LocatorIsBad("Infinity"), "Infinity");
    }
    @Test
    public void firstTest3(){
        calculatorPage3 = new CalculatorPage3(driver);
        calculatorPage3.writeText3("Калькулятор");
        calculatorPage3.clickButton3();
        calculatorPage3.clickCalculators3();
        calculatorPage3.LocatorIsBadError("Error");
        Assert.assertEquals(calculatorPage3.LocatorIsBadError("Error"), "Error");
    }
    }