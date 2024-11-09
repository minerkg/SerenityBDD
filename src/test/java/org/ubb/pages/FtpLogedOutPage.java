package org.ubb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;


@DefaultUrl("https://www.scs.ubbcluj.ro/vvta/net2ftp/")
public class FtpLogedOutPage extends PageObject {


    @FindBy(xpath="/html/body/div/div[2]/div/div[2]/div[1]/p")
    private WebElementFacade logOutText ;


    public List<String> getLogoutText() {
        WebElementFacade definitionList = find(By.tagName("div"));
        return definitionList.findElements(By.tagName("p")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }


    public boolean user_is_logged_out() {
        return  logOutText.containsText("You have logged out from the FTP server.");
    }
}
