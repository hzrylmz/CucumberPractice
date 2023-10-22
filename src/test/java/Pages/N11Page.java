package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11Page {
    public  N11Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(className = "btnSignIn")
    public WebElement btnSignIn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement btnEmail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement btnPassword;

    @FindBy(xpath = "//div[@id='loginButton']")
    public WebElement LoginButton;

    @FindBy(css ="a[title='Hesabım']")
    public WebElement btnHesabim;

    @FindBy(css = "a[title='Çıkış Yap']")
    public WebElement btnLogout;



}

