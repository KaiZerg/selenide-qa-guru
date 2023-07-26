package github;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSolutionsMenuTest extends TestBase{
    @Test
    void shouldFindSelenideHeader() {
        open("https://github.com/");
        $$(".HeaderMenu-link").get(1).shouldHave(text("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".application-main").shouldHave(text("Build like the best"));
        sleep(5000);
    }
}
