package dev.etech.automation.web.funcs;

import dev.etech.automation.web.common.BaseTest;
import dev.etech.automation.web.pages.CadastroPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CadastroFunc extends BaseTest {
    CadastroPage cadastroPage = new CadastroPage();

    public void preencheDadosPrimeiroPasso(){
        String nome = faker.name().firstName();
        driver.findElement(cadastroPage.getCampoNomeCompleto()).sendKeys(nome);
        String apelido = faker.name().username();
        driver.findElement(cadastroPage.getCampoApelido()).sendKeys(apelido);
        driver.findElement(cadastroPage.getCampoTelefone()).sendKeys("11995356556");
        driver.findElement(cadastroPage.getCampoNascimento()).sendKeys("09/05/1997");
        ((ChromeDriver) driver).findElements(cadastroPage.getBotaoProsseguir()).get(0).click();
    }

    public void preencheDadosSegundoPasso(){
        driver.findElement(cadastroPage.getCampoCep()).sendKeys("07790815");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((ChromeDriver) driver).findElements(cadastroPage.getBotaoProsseguir()).get(1).click();
    }

    public void preencheDadosTerceiroPasso(){
        String email = faker.internet().emailAddress();
        driver.findElement(cadastroPage.getCampoEmail()).sendKeys(email);
        String senha = faker.internet().password(8,12);
        driver.findElement(cadastroPage.getCampoSenha()).sendKeys(senha);
        driver.findElement(cadastroPage.getCampoConfirmarSenha()).sendKeys(senha);
        driver.findElement(cadastroPage.getBotaoCriarConta()).click();
    }


}
