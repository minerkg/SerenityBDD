package org.ubb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://www.scs.ubbcluj.ro/vvta/net2ftp/")
public class FtpUsersPage extends PageObject {


    @FindBy(xpath="/html/body/div/div[2]/div/div[1]/div/form/a[4]/img")
    private WebElementFacade logoutButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/form/table[1]/tbody/tr/td/input[1]")
    private WebElementFacade createFolderButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/form/input[25]")
    private WebElementFacade folderNameInput;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/form/a[2]/img")
    private WebElementFacade submitButtonForCreateFolder;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/form/a[1]/img")
    private WebElementFacade afterCreatebackButton;



    @FindBy(xpath = "/html/body/div/div[2]/div/form/table[2]/tbody/tr[3]/td[1]/input[1]")
    private WebElementFacade selectFolderForDelete;

    @FindBy(xpath = "/html/body/div/div[2]/div/form/table[1]/tbody/tr/td/div/input[3]")
    private WebElementFacade deleteButton;


    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/form/a[2]/img")
    private WebElementFacade confirmDelete;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/form/a/img")
    private WebElementFacade backAfterDelete;


    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/form/li")
    private WebElementFacade deletedText;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/form")
    private WebElementFacade createdText;


    public void create_directory(String directoryName) {
        createFolderButton.click();
        folderNameInput.type(directoryName);
        submitButtonForCreateFolder.click();
    }

    public void back_after_create() {
        afterCreatebackButton.click();
    }

    public boolean directory_is_created() {
        return createdText.containsText("Directory coci_vvss was successfully created.");

    }

    public void delete_directory() {
        selectFolderForDelete.click();
        deleteButton.click();
        confirmDelete.click();

    }



    public boolean directory_is_deleted() {
        return deletedText.containsText("All the selected directories and files have been processed.");

    }

    public void back_after_delete() {
        backAfterDelete.click();
    }

    public void logout() {logoutButton.click();}

    public boolean user_is_logged_in() {
        // TODO
        return true;
    }
}
