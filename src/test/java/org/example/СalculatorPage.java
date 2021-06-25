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
    public WebElement poisK;

    @FindBy(xpath="//input[@value='Поиск в Google']")
    public WebElement Input;

    @FindBy(xpath="//div[@jsname='j93WEe']")
    public WebElement otkrSkobka;

    @FindBy(xpath="//div[@jsname='N10B9']")
    public WebElement number1;

    @FindBy(xpath="//div[@aria-label='сложение']")
    public WebElement slojenie;

    @FindBy(xpath="//div[@jsname='lVjWed']")
    public WebElement number2;

    @FindBy(xpath="//div[@aria-label='закрывающая скобка']")
    public WebElement zakrSkobka;

    @FindBy(xpath="//div[@aria-label='умножение']")
    public WebElement ymnojenie;

    @FindBy(xpath="//div[@jsname='KN1kY']")
    public WebElement number3;

    @FindBy(xpath="//div[@aria-label='вычитание']")
    public WebElement vichetanie;

    @FindBy(xpath="//div[@jsname='xAP7E']")
    public WebElement number4;

    @FindBy(xpath="//div[@jsname='bkEvMb']")
    public WebElement number0;

    @FindBy(xpath="//div[@aria-label='деление']")
    public WebElement delenie;

    @FindBy(xpath="//div[@jsname='Ax5wH']")
    public WebElement number5;

    @FindBy(xpath="//div[@aria-label='равно']")
    public WebElement ravno;

    @FindBy(xpath="//div[@jsname='zLiRgc']")
    public WebElement ravno1;

    public String writeText(String text){
        poisK.sendKeys(text);
        return text;
    }
        public  void clickKnopky(){
        Input.click();
    }
    public void clickCalculators(){
        otkrSkobka.click();
        number1.click();
        slojenie.click();
        number2.click();
        zakrSkobka.click();
        ymnojenie.click();
        number3.click();
        vichetanie.click();
        number4.click();
        number0.click();
        delenie.click();
        number5.click();
        ravno.click();
    }
    public void LocatorIsGood(){
        ravno1.equals(ravno);
        }
    }