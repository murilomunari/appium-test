package com.test.steps;

import com.test.screen.ScreenLogin;
import io.cucumber.java.pt.Dado;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Dado("que eu leio mensagem de erro")
    public void ler_mensagem(){
        String expectedMessage = "erro a processar uma request =("; //não esta funcionando apenas vou deixar aqui apenas para aprendizado
        String realMessage = login.getMessage();
        assertEquals(expectedMessage, realMessage);
    }
}
