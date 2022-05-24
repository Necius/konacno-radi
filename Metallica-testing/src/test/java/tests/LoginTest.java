package tests;

import browser.Browser;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {

    private Object String;


    @Before
    public void testSetup() {
        Browser.getBrowser().get("https://www.kupindo.com/");
        Browser.getBrowser().manage().window().maximize();

    }

    @Test
    public void testCaseMet_002() throws InterruptedException {
        assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());
        kupindo.getHomePage().getUlazButton().click();
        assertEquals("https://www.kupindo.com/Prijava", Browser.getBrowser().getCurrentUrl());
//        kupindo.getPrijavaPage().getKorisnickoImeField().click();
        kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("zastava");
        Thread.sleep(1500);
//        kupindo.getPrijavaPage().getLozinkaField().click();
        kupindo.getPrijavaPage().getLozinkaField().sendKeys("abarth");
        Thread.sleep(1500);
        kupindo.getPrijavaPage().getUlazPrijavaButton().click();
        kupindo.getHomePage().getIzlazButton().click();

        assertEquals("https://www.kupindo.com/Odjava", Browser.getBrowser().getCurrentUrl());
    }

    private void assertEquals(java.lang.String s, java.lang.String currentUrl) {}





    @Test
    public void testCaseMet_004() {
//        metallica.getHomePage().getLoginButton().click();
//        metallica.getLoginPage().getEmailField().sendKeys("nemanja.jovanovic325@gmail.com");
//        metallica.getLoginPage().getPasswordField().sendKeys("africaner20-19");
//        metallica.getLoginPage().getLoginFormButton().click();
//        assertTrue(metallica.getLoginPage().getErrorMessage().isDisplayed());
        assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());
        kupindo.getHomePage().getUlazButton().click();
        assertEquals("https://www.kupindo.com/Prijava", Browser.getBrowser().getCurrentUrl());
        kupindo.getPrijavaPage().getKorisnickoImeField().click();
        kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("1234");
//        Thread.sleep(1500);
        kupindo.getPrijavaPage().getLozinkaField().click();
        kupindo.getPrijavaPage().getLozinkaField().sendKeys("1234");
//        Thread.sleep(1500);
        kupindo.getPrijavaPage().getUlazPrijavaButton().click();
//        kupindo.getHomePage().getIzlazButton().click();

       assertTrue(kupindo.getPrijavaPage().getPogresnoKorisnickoImeIliLozinka().isDisplayed());

    }
}
//
//    @Test
//    public void testCaseMet_005() throws InterruptedException {
//        metallica.getHomePage().getLoginButton().click();
//        metallica.getLoginPage().getEmailField().sendKeys("nemanja.jovanovic325@gmail.com");
//        metallica.getLoginPage().getPasswordField().sendKeys("Africaner20-19");
//        metallica.getLoginPage().getLoginFormButton().click();
//        metallica.getLoginPage().getDownloadMyDataButton().click();
//        Thread.sleep(3000);
//
//        File dir = new File("C:\\Users\\Admin\\Downloads");
//        File[] dirContents = dir.listFiles();
//
//        boolean isDownloaded = false;
//        for (int i = 0; i < dirContents.length; i++) {
//
//            if (dirContents[i].getName().equals("Metallica_Nemanja_Jovanovic.json")) {
//
//                isDownloaded = true;
//                dirContents[i].delete();
//                break;
//            }
//        }
//        assertEquals(true, isDownloaded);
//
//
//    }
//
//

