package dev.etech.automation.web.pages;

import org.openqa.selenium.By;

public class LoginPage {
    By campoEmailRegistrado = By.id("email");
    By campoSenhaRegistrada = By.id("password");
    By botaoEntrar = By.xpath("//button[@class='button btn-filled']");
    By campoEsqueciSenha = By.xpath("//a[@href='/recuperar-senha']");
    By campoCriarConta = By.xpath("//a[@href='/cadastro']");
    By linkQueroCriarUmaConta = By.xpath("//a[@href='/cadastro']");
    
    
    public By getCampoEmailRegistrado() {return campoEmailRegistrado;}

    public By getCampoSenhaRegistrada() {return campoSenhaRegistrada;}

    public By getBotaoEntrar() {return botaoEntrar;}

    public By getCampoEsqueciSenha() {return campoEsqueciSenha;}

    public By getCampoCriarConta() {return campoCriarConta;}

    public By getLinkQueroCriarUmaConta() {
        return linkQueroCriarUmaConta;
    }
}
