package dev.etech.automation.web.steps;

import dev.etech.automation.web.funcs.HomeFunc;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class HomeStep {

    HomeFunc homeFunc = new HomeFunc();

    @Entao("devo visualizar o campo {string}")
    public void vizualizarNome(String usuario){
        Assert.assertEquals(usuario, homeFunc.getTitleNome());
}

    @Quando("realizar o logout")
    public void clicarCampoSair(){
        homeFunc.clicarCampoSair();
    }

    @Entao("deve realizar o cadastro com sucesso")
    public void vizualizaCampoProcurar(){
        Assert.assertEquals("O que você procura ?", homeFunc.getCampoProcura());

    }


}
