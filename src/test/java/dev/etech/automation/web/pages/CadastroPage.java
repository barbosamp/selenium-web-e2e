package dev.etech.automation.web.pages;

import org.openqa.selenium.By;

public class CadastroPage {
    By campoNomeCompleto = By.xpath("//*[@id='nome']");
    By campoApelido = By.xpath("//*[@id='apelido']");
    By campoTelefone = By.xpath("//*[@id='telefone']");
    By campoNascimento = By.xpath("//*[@id='nascimento']");
    By botaoProsseguir = By.xpath("//button[child::div[contains(text(),'Prosseguir')]]");
    By campoCep = By.xpath("//*[@id='cep']");
    By campoRua = By.xpath("//*[@id='rua']");
    By campoEmail = By.xpath("//*[@id='email']");
    By campoSenha = By.xpath("//*[@id='senha']");
    By campoConfirmarSenha = By.xpath("//*[@id='confirmSenha']");
    By botaoCriarConta = By.xpath("//button[child::div[contains(text(),'Criar Conta')]]");



    public By getCampoNomeCompleto() {
        return campoNomeCompleto;
    }

    public By getCampoApelido() {
        return campoApelido;
    }

    public By getCampoTelefone() {
        return campoTelefone;
    }

    public By getCampoNascimento() {
        return campoNascimento;
    }

    public By getBotaoProsseguir() {
        return botaoProsseguir;
    }

    public By getCampoCep() {
        return campoCep;
    }

    public By getCampoRua() {
        return campoRua;
    }

    public By getCampoEmail() {
        return campoEmail;
    }

    public By getCampoSenha() {
        return campoSenha;
    }

    public By getCampoConfirmarSenha() {
        return campoConfirmarSenha;
    }

    public By getBotaoCriarConta() {
        return botaoCriarConta;
    }
}
