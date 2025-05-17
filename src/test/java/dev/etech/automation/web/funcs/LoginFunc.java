package dev.etech.automation.web.funcs;

import dev.etech.automation.web.common.BaseTest;
import dev.etech.automation.web.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();
    public void acessarTelaLogin(){
        driver.get("https://automation-web.etech.dev/");
    }

    public void realizarLogin(String usuario, String senha){
        driver.findElement(loginPage.getCampoEmailRegistrado()).sendKeys(usuario);
        driver.findElement(loginPage.getCampoSenhaRegistrada()).sendKeys(senha);
        driver.findElement(loginPage.getBotaoEntrar()).click();
    }

    public String getNomeEsqueciSenha() {
        return driver.findElement(loginPage.getCampoEsqueciSenha()).getText();
    }

    public void clicarCampoCriarConta(){
        driver.findElement(loginPage.getCampoCriarConta()).click();
    }

    public void acessarTelaCadastro(){
        driver.findElement(loginPage.getLinkQueroCriarUmaConta()).click();
    }

    public void validaExistenciaTelaLogin(){
        wait.until(ExpectedConditions.urlContains("/login"));
    }
}
