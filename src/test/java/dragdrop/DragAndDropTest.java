package dragdrop;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
    @DisplayName("1 - replace elements using dragAndDropTo method")
    @Test
    void replacingElementsMethod() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));

        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }
    @DisplayName("2 - replace elements using Selenide Actions")
    @Test
    void replacingElementsSelenideAction() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement a = $("#column-a");
        SelenideElement b = $("#column-b");
        Selenide.actions().dragAndDrop(a, b).build().perform();

        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

       sleep(5000);
    }
}
