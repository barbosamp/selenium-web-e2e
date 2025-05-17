package dev.etech.automation.web.steps;

import dev.etech.automation.web.funcs.LoginFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();
    @Dado("que o cliente esteja na tela de login")
    public void estiverNaTelaLogin(){
        loginFunc.acessarTelaLogin();

    }

    @Quando("inserir os dados do usuário")
    public void inserirOsDadosDoUsuario(DataTable dataTable) {
        List<Map<String, String>> usuario = dataTable.asMaps();
        String email = usuario.get(0).get("email");
        String senha = usuario.get(0).get("senha");
        loginFunc.realizarLogin(email, senha);
    }

    @Entao("devo realizar o logout com sucesso")
    public void devoVisualizarCampoEsqueciSenha(){
        Assert.assertEquals("Esqueci minha senha", loginFunc.getNomeEsqueciSenha());
    }

    @E("clicar no campo Quero criar conta")
    public void clicarCampoCriarConta(){
        loginFunc.clicarCampoCriarConta();
    }


    @E("acesso a tela de cadastro de usuário")
    public void acessoATelaDeCadastroDeUsuário() {
        loginFunc.acessarTelaCadastro();
    }

    @Então("devo visualizar a tela de login")
    public void devoVisualizarATelaDeLogin() {
        loginFunc.validaExistenciaTelaLogin();
    }
}
