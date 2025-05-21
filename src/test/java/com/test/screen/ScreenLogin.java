package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenLogin extends BaseScreen {

    @AndroidFindBy(id = "login_username")
    private RemoteWebElement fieldEmail;

    @AndroidFindBy(id = "login_password")
    private RemoteWebElement fieldPassword;

    @AndroidFindBy(id = "login_button")
    private RemoteWebElement fieldButton;

    @AndroidFindBy(id = "mensagem2")
    private RemoteWebElement message;

    public void writeEmail(){
        fieldEmail.sendKeys("qazando@gmail.com");
    }

    public void writePassword(){
        fieldPassword.sendKeys("1234");
    }

    public void clickButton(){
        fieldButton.click();
    }

    public String getMessage(){
        return message.getText();
    }
}
