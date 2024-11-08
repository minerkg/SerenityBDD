package org.ubb.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.ubb.steps.serenity.EndUserSteps;



@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/data.csv")
public class CreateAndDeleteDirectoryStory {

    private String userName;
    private String password;
    private String ftpServerName;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps myUser;



    @Issue("#Lab5")
    @Test
    public void create_directory_with_success() {
        //myUser.is_the_home_page();
        myUser.user_logging_in(ftpServerName, userName, password);
        // myUser.user_is_logged_in();

        myUser.create_directory("coci_vvss");
        myUser.directory_is_created();

        myUser.delete_directory();
        myUser.directory_is_deleted();

        myUser.user_logging_out();
        // myUser.user_is_logged_out();

    }




} 