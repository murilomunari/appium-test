package com.test.steps;

import com.test.screen.ScreenLogin;
import cucumber.api.java.pt.Dado;

public class LoginSteps {

    ScreenLogin login = new ScreenLogin();

    @Dado("^que eu escreva as informações do usuário$")
    public void que_eu_escreva_as_informações_do_usuário() {
        login.writeEmail();
    }
}
