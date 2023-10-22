package StepDefinitions;

import Pages.N11Page;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static Utilities.Driver.getDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class N11Step {

    N11Page n11page =  new N11Page();
    Actions actions = new Actions(getDriver());
    /*
    - moveToElement(WebElement element): Belirtilen elementin üzerine gelmek(hover) için kullanılır.
    -click(): Belirtilen elemente tıklamak için kullanılır.
    -doubleclick(): Belirtilen elemente çift tıklamak için kullanılır.
    -contextClick(): Belirtilen elemente sağ tıklamak için kullanılır.
    -dragAndDrop(WebElement source, WebElement target) : Sürükleyip bırakma
     */

    @Given("Kullanıcı Anasayfaya gider.")
    public void kullanıcıAnasayfayaGider() {
        //getDriver().get(ConfigReader.getProperty("urlN11"));
    }

    @When("Ana sayfanın yüklendiği doğrulanır.")
    public void anaSayfanınYuklendigiDogrulanır() {
        String actualTitle = getDriver().getTitle();
        String expectedTitle = "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        assertEquals(expectedTitle, actualTitle);
    }

    @And("Kullanıcı ana sayfada Giriş Yap butonunu bulur ve tıklar.")
    public void kullanıcıAnaSayfadaGirisYapButonunuBulurVeTıklar() {
        n11page.btnSignIn.click();
    }

    @And("Giriş sayfasının yüklendiği doğrulanır.")
    public void girisSayfasınınYuklendigiDogrulanır() {
        String actualTitle = getDriver().getTitle();
        String expectedTitle = "Giriş Yap - n11.com";
        assertEquals(expectedTitle, actualTitle);
    }

    @And("Kullanıcı giriş sayfasında geçerli bir kullanıcı adı  girer.")
    public void kullanıcıGirisSayfasındaGecerliBirKullanıcıAdıGirer() {
        n11page.btnEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Kullanıcı giriş sayfasında geçerli bir şifre girer.")
    public void kullanıcıGirisSayfasındaGecerliBirSifreGirer() {
        n11page.btnPassword.sendKeys(ConfigReader.getProperty("sifre"));

    }

    @And("Kullanıcı {string} butonuna tıklar.")
    public void kullanıcıButonunaTıklar(String arg0) {
        n11page.LoginButton.click();
    }

    @And("Kullanıcının hesabına başarıyla giriş yapıldığı doğrulanır.")
    public void kullanıcınınHesabınaBasarıylaGirisYapıldıgıDogrulanır() {
        actions.moveToElement(n11page.btnHesabim).perform();
        assertTrue( n11page.btnLogout.isEnabled());  // Buton görünüyor ve tıklanabilir mi?


    }


}
