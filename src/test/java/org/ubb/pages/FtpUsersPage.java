package org.ubb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class FtpUsersPage extends PageObject {


    @FindBy(xpath="*[@id=\"StatusbarForm\"]/a[4]/img")
    private WebElementFacade logoutButton;



    public void create_directory(String directoryName) {

        // TODO
    }
    public boolean directory_is_created() {
        // TODO
        return false;
    }

    public void delete_directory() {
        // TODO
    }

    public boolean directory_is_deleted() {
        // TODO
        return false;
    }



    public void logout() {logoutButton.click();}

    public boolean user_is_logged_in() {
        // TODO
        return true;
    }
}
