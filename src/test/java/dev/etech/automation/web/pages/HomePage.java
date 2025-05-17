package dev.etech.automation.web.pages;

import org.openqa.selenium.By;

public class HomePage {
    By titleNome = By.xpath("//p[@class='logged-user']");
    By campoSair = By.xpath("//a[@href='/logout' and @class='link']");
    By campoProcura = By.xpath("//label[@class='label']");
    By loading = By.xpath("//*[@fill-rule='evenodd']");


    public By getTitleNome() {return titleNome;}

    public By getCampoSair() {return campoSair;}

    public By getCampoProcura() {return campoProcura;}

    public By getLoading() {
        return loading;
    }
}
