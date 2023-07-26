package selenide;

import com.codeborne.selenide.SelenideElement;
import github.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTests extends TestBase {
    @Test
    void shouldFindSelenideHeader() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        SelenideElement columnA = $("#column-a");
        SelenideElement columnB = $("#column-b");

        columnA.dragAndDropTo(columnB);
    }
}
