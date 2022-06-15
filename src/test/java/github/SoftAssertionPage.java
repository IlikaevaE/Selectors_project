package github;

import org.junit.jupiter.api.Test;

public class SoftAssertionPage extends  TestBase{
    @Test
void testExecute() {
        softAssertion.openPage()
                .chooseWiki()
                .settingValue()
                .filterValue()
                .checkResult();
    }
}
