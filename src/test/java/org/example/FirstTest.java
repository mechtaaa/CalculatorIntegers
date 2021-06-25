package org.example;
import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends Settings {
    @Test
        public void firstTest() {
        calculatorPage= new СalculatorPage(driver);
        calculatorPage.writeText("Калькулятор");
        calculatorPage.clickKnopky();
        calculatorPage.clickCalculators();
        calculatorPage.LocatorIsGood();
    }
    }