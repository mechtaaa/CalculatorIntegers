package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage2 {
    public WebDriver driver;

    public CalculatorPage2(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="//input[@title='Поиск']")
    public WebElement Search2;

    @FindBy(xpath="//input[@value='Поиск в Google']")
    public WebElement Input2;

    @FindBy(xpath="//div[@jsname='abcgof']")
    public WebElement numbernum6;

    @FindBy(xpath="//div[@aria-label='деление']")
    public WebElement share;

    @FindBy(xpath="//div[@jsname='bkEvMb']")
    public WebElement numbernum0;

    @FindBy(xpath="//div[@aria-label='равно']")
    public WebElement equally;

    public String writeText2(String text){
        Search2.sendKeys(text);
        return text;
    }
    public void clickButton2(){
        Input2.click();
    }
    public void clickCalculators2(){
        numbernum6.click();
        share.click();
        numbernum0.click();
        equally.click();
    }
    public String LocatorIsBad(String text){
        return "Infinity";
}
}