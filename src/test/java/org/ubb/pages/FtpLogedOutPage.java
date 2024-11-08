package org.ubb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class FtpLogedOutPage extends PageObject {


    @FindBy(name="")
    private WebElementFacade  ;


    public List<String> getLogoutText() {
        WebElementFacade definitionList = find(By.tagName("div"));
        return definitionList.findElements(By.tagName("p")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }


    public boolean user_is_logged_out() {
        //TODO
    }
}
