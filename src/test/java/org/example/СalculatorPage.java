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
    public WebElement search;

    @FindBy(xpath="//input[@value='Поиск в Google']")
    public WebElement input;

    @FindBy(xpath="//div[@jsname='j93WEe']")
    public WebElement openBracket;

    @FindBy(xpath="//div[@jsname='N10B9']")
    public WebElement number1;

    @FindBy(xpath="//div[@aria-label='сложение']")
    public WebElement plus;

    @FindBy(xpath="//div[@jsname='lVjWed']")
    public WebElement number2;

    @FindBy(xpath="//div[@aria-label='закрывающая скобка']")
    public WebElement closeBracket;

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

    @FindBy(xpath="//input[@title='Поиск']")
    public WebElement search2;

    @FindBy(xpath="//input[@value='Поиск в Google']")
    public WebElement input2;

    @FindBy(xpath="//div[@jsname='abcgof']")
    public WebElement numbernum6;

    @FindBy(xpath="//div[@aria-label='деление']")
    public WebElement share2;

    @FindBy(xpath="//div[@jsname='bkEvMb']")
    public WebElement numbernum0;

    @FindBy(xpath="//div[@aria-label='равно']")
    public WebElement equally2;

    @FindBy(xpath="//input[@title='Поиск']")
    public WebElement search3;

    @FindBy(xpath="//input[@value='Поиск в Google']")
    public WebElement input3;

    @FindBy(xpath="//div[@jsname='aN1RFf']")
    public WebElement sin;

    @FindBy(xpath="//div[@jsname='Pt8tGc']")
    public WebElement equally3;

    public String writeText(String text){
        search.sendKeys(text);
        return text;
    }
        public  void clickButton(){
        input.click();
    }
    public void clickCalculators(){
        openBracket.click();
        number1.click();
        plus.click();
        number2.click();
        closeBracket.click();
        multiply.click();
        number3.click();
        minus.click();
        number4.click();
        number0.click();
        share.click();
        number5.click();
        equally.click();
    }
    public String writeText2(String text){
        search2.sendKeys(text);
        return text;
    }
    public void clickButton2(){
        input2.click();
    }
    public void clickCalculators2(){
        numbernum6.click();
        share2.click();
        numbernum0.click();
        equally2.click();
    }
    public String writeText3(String text){
        search3.sendKeys(text);
        return text;
    }
    public void clickButton3(){
        input3.click();
    }
    public void clickCalculators3(){
        sin.click();
        equally3.click();
    }
    public String check(){
        int i = 1;
        String string = Integer.toString(i);
        return string;
    }
    public String check2(){
        String string2 = "Infinity";
        return string2;
    }
    public String check3(){
        String string3 = "Error";
        return string3;
    }
}