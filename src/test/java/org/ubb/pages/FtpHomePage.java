package org.ubb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.scs.ubbcluj.ro/vvta/net2ftp/")
public class FtpHomePage extends PageObject {

    @FindBy(name="Save")
    private WebElementFacade saveCookieChoiceButton;

    @FindBy(name="ftpserver")
    private WebElementFacade FTPserverEditBox;

    @FindBy(name="name")
    private WebElementFacade userNameEditBox;

    @FindBy(name="password")
    private WebElementFacade passwordEditBox;

    @FindBy(name="Login")
    private WebElementFacade loginButton;



    public void enter_server(String server) {
        FTPserverEditBox.type(server);
    }

    public void enter_user_name(String nameText) {
        userNameEditBox.type(nameText);
    }

    public void enter_password(String passwordText) {
        passwordEditBox.type(passwordText);
    }

    public void save_cookie_choice() {
        saveCookieChoiceButton.click();
    }

    public void login() {loginButton.click();}





}