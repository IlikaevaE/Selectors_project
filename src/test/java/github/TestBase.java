package github;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase  {
    SoftAssertion softAssertion = new SoftAssertion();

    @BeforeAll
    static void BeforeAll() {

    }
}
