package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class СalculatorPage {
    public  WebDriver driver;

    public  СalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="//input[@title='Поиск']")
    public WebElement Search;

    @FindBy(xpath="//input[@value='Поиск в Google']")
    public WebElement Input;

    @FindBy(xpath="//div[@jsname='j93WEe']")
    public WebElement OpenBracket;

    @FindBy(xpath="//div[@jsname='N10B9']")
    public WebElement number1;

    @FindBy(xpath="//div[@aria-label='сложение']")
    public WebElement plus;

    @FindBy(xpath="//div[@jsname='lVjWed']")
    public WebElement number2;

    @FindBy(xpath="//div[@aria-label='закрывающая скобка']")
    public WebElement CloseBracket;

    @FindBy(xpath="//div[@aria-label='умножение']")
    public WebElement multiply;

    @FindBy(xpath="//div[@jsname='KN1kY']")
    public WebElement number3;

    @FindBy(xpath="//div[@aria-label='вычитание']")
    public WebElement minus;

    @FindBy(xpath="//div[@jsname='xAP7E']")
    public WebElement number4;

    @FindBy(xpath="//div[@jsname='bkEvMb']")
    public WebElement number0;

    @FindBy(xpath="//div[@aria-label='деление']")
    public WebElement share;

    @FindBy(xpath="//div[@jsname='Ax5wH']")
    public WebElement number5;

    @FindBy(xpath="//div[@aria-label='равно']")
    public WebElement equally;

    @FindBy(xpath="//div[@jsname='zLiRgc']")
    public WebElement Number;

    public String writeText(String text){
        Search.sendKeys(text);
        return text;
    }
        public  void clickButton(){ Input.click();
    }
    public void clickCalculators(){
        OpenBracket.click();
        number1.click();
        plus.click();
        number2.click();
        CloseBracket.click();
        multiply.click();
        number3.click();
        minus.click();
        number4.click();
        number0.click();
        share.click();
        number5.click();
        equally.click();
    }
    public int LocatorIsGood(int number){
        return 1;
    }
    }