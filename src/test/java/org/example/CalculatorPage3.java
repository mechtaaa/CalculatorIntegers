package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage3 {
    public WebDriver driver;

    public CalculatorPage3(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="//input[@title='Поиск']")
    public WebElement Search3;

    @FindBy(xpath="//input[@value='Поиск в Google']")
    public WebElement Input3;

    @FindBy(xpath="//div[@jsname='aN1RFf']")
    public WebElement sin;

    @FindBy(xpath="//div[@jsname='Pt8tGc']")
    public WebElement equally;

    public String writeText3(String text){
        Search3.sendKeys(text);
        return text;
    }
    public void clickButton3(){
        Input3.click();
    }
    public void clickCalculators3(){
        sin.click();
        equally.click();
    }
    public String LocatorIsBadError(String text){
        return "Error";
}
}