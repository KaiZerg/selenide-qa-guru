package selenide;

import com.codeborne.selenide.SelenideElement;
import github.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests extends TestBase {

    SelenideElement columnA = $("#column-a");
    SelenideElement columnB = $("#column-b");

    @Test
    void moveToElementTest () {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().clickAndHold($(columnA)).moveToElement($(columnB)).release().perform();
    }

    @Test
    void dragAndDropToTest () {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a header").shouldHave(text("A"));
        $("#column-b header").shouldHave(text("B"));
        columnA.dragAndDropTo(columnB);
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));
    }
}
