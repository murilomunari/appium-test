package com.test.steps;

import com.test.screen.ScreenLogin;
import io.cucumber.java.pt.Dado;

public class LoginSteps {

    ScreenLogin login = new ScreenLogin();

    @Dado("que eu escreva o email do usuário")
    public void que_eu_escreva_o_email_do_cliente() {
        login.writeEmail();
    }

    @Dado("que eu escreva a senha do usuario")
    public void que_eu_escreva_a_senha_do_cliente(){
        login.writePassword();
    }

    @Dado("que eu clique no botão")
    public void que_eu_clique_no_botao(){
        login.clickButton();
    }
}
