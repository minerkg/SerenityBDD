package org.ubb.steps.serenity;

import org.ubb.pages.FtpHomePage;
import net.thucydides.core.annotations.Step;
import org.ubb.pages.FtpLogedOutPage;
import org.ubb.pages.FtpUsersPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    private FtpHomePage ftpHomePage;
    private FtpUsersPage ftpUsersPage;
    private FtpLogedOutPage ftpLogedOutPage;

    @Step
    public void enterServer(String server)
    {
        ftpHomePage.enter_server(server);
    }

    @Step
    public void enterName(String name)
    {
        ftpHomePage.enter_user_name(name);
    }

    @Step
    public void enterPassword(String password)
    {
        ftpHomePage.enter_password(password);
    }

    @Step
    public void saveCookieChoice()
    {
        ftpHomePage.save_cookie_choice();
    }

    @Step
    public void pressLogin()
    {
        ftpHomePage.login();
    }

    @Step
    public void pressLogout()
    {
        ftpHomePage.logout();
    }

    @Step
    public void should_see_message(String message) {
        assertThat(ftpHomePage.getLogoutText(), hasItem(containsString(message)));
    }

}