package github;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

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
    public SoftAssertion settingValue(String setValue) {
        inputValueWiki.setValue(setValue);
        return this;
    }
    public SoftAssertion filterValue(String fullValue) {
        filterValue.$$("li").filterBy(text(fullValue)).first().click();
        return this;
    }
    
    public SoftAssertion checkResult(String textResult) {
        selectArea.shouldHave(text(textResult)).$("a");
        return this;
    }

}
