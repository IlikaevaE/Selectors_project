package github;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static github.TestData.*;

public class SoftAssertion {

    SelenideElement
    wikiClick = $("#wiki-tab"),
    inputValueWiki = $("#wiki-pages-filter"),
    filterValue = $("ul[data-filterable-for=\"wiki-pages-filter\"]"),
    selectArea = $(".markdown-body");

    public SoftAssertion openPage() {
        open("https://github.com/selenide/selenide");
        return this;
    }

    public SoftAssertion chooseWiki() {
        wikiClick.click();
        return this;
    }
    public SoftAssertion settingValue() {
        inputValueWiki.setValue(VALUE);
        return this;
    }
    public SoftAssertion filterValue() {
        filterValue.$$("li").filterBy(text(FULL_VALUE)).first().click();
        return this;
    }
    
    public SoftAssertion checkResult() {
        selectArea.shouldHave(text(TEXT_RESULT)).$("a");
        return this;
    }

}
