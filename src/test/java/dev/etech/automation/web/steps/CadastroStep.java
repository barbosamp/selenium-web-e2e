package dev.etech.automation.web.steps;

import dev.etech.automation.web.funcs.CadastroFunc;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class CadastroStep {
    private CadastroFunc cadastroFunc = new CadastroFunc();

    @E("preencho os campos de cadastro com dados válidos")
    public void preenchoOsCamposDeCadastroComDadosValidos(){
        cadastroFunc.preencheDadosPrimeiroPasso();
        cadastroFunc.preencheDadosSegundoPasso();
        cadastroFunc.preencheDadosTerceiroPasso();
    }

}
