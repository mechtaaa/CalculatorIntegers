package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class СalculatorPage {
    public  WebDriver driver;
    public  СalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="//input[@title='Поиск']")
    public WebElement poisK;

    @FindBy(xpath="//input[@value='Поиск в Google']")
    public WebElement Input;


    public String writeText(String text){
        poisK.sendKeys(text);
        return text;
    }

    public  void clickKnopky(){

        Input.click();
    }

    @FindBy(xpath="//div[@jsname='j93WEe']")
    public WebElement a;
    public void clic(){
        a.click();
    }
    @FindBy(xpath="//div[@jsname='N10B9']")
    public WebElement b;
    public void clicKnopkyb(){
        b.click();
    }
    @FindBy(xpath="//div[@aria-label='сложение']")
    public WebElement c;
    public void clicKnopkyc(){
        c.click();
    }
    @FindBy(xpath="//div[@jsname='lVjWed']")
    public WebElement d;
    public void clicKnopkyd(){
        d.click();
    }
    @FindBy(xpath="//div[@aria-label='закрывающая скобка']")
    public WebElement e;
    public void clicer(){
        e.click();
    }


    @FindBy(xpath="//div[@aria-label='умножение']")
    public WebElement f;
    public void clicKnopkyf(){
        f.click();
    }
    @FindBy(xpath="//div[@jsname='KN1kY']")
    public WebElement g;
    public void clicKnopkyg(){
        g.click();
    }
    @FindBy(xpath="//div[@aria-label='вычитание']")
    public WebElement q;
    public void clicKnopkyq(){
        q.click();
    }
    @FindBy(xpath="//div[@jsname='xAP7E']")
    public WebElement l;
    public void clicKnopkyl(){
        l.click();
    }
    @FindBy(xpath="//div[@jsname='bkEvMb']")
    public WebElement o;
    public void clicKnopkyo(){
        o.click();
    }
    @FindBy(xpath="//div[@aria-label='деление']")
    public WebElement k;
    public void clicKnopkyk(){
        k.click();
    }
    @FindBy(xpath="//div[@jsname='Ax5wH']")
    public WebElement m;
    public void clicKnopkym(){
        m.click();
    }
    @FindBy(xpath="//div[@aria-label='равно']")
    public WebElement ent;
    public void clicKnopkyent(){
        ent.click();
    }








}
