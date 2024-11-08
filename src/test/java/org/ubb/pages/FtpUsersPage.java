package org.ubb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class FtpUsersPage extends PageObject {


    @FindBy(xpath="*[@id=\"StatusbarForm\"]/a[4]/img")
    private WebElementFacade logoutButton;






    public void logout() {logoutButton.click();}
}
