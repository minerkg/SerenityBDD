package org.ubb.steps.serenity;

import org.ubb.pages.FtpHomePage;
import net.thucydides.core.annotations.Step;
import org.ubb.pages.FtpLogedOutPage;
import org.ubb.pages.FtpUsersPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertTrue;

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
    public void user_logging_in(String server, String user, String password) {
        enterServer(server);
        enterName(user);
        enterPassword(password);
        pressLogin();
    }

    @Step
    public void user_is_logged_in() {
        assertTrue(ftpUsersPage.user_is_logged_in());
    }

    public void user_is_logged_out() {
        assertTrue(ftpLogedOutPage.user_is_logged_out());
    }

    @Step
    public void create_directory() {
        ftpUsersPage.create_directory();
    }

    @Step
    public void directory_is_created() {
        assertTrue(ftpUsersPage.directory_is_created());
    }

    @Step
    public void delete_directory() {
        ftpUsersPage.delete_directory();
    }

    @Step
    public void directory_is_deleted() {
        assertTrue(ftpUsersPage.directory_is_deleted());
    }

    @Step
    public void pressLogout()
    {
        ftpUsersPage.logout();
    }

    @Step
    public void should_see_logged_out_message(String message) {
        assertThat(ftpLogedOutPage.getLogoutText(), hasItem(containsString(message)));
    }

    public void user_logging_out() {
        ftpUsersPage.logout();
    }
}