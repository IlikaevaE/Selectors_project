package github;

import org.junit.jupiter.api.Test;

import static github.TestData.*;

public class SoftAssertionPage extends  TestBase{
    @Test
void testExecute() {
        softAssertion.openPage()
                .chooseWiki()
                .settingValue(VALUE)
                .filterValue(FULL_VALUE)
                .checkResult(TEXT_RESULT);
    }
}
