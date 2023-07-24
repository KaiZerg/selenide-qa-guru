package github;

import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch extends TestBase{

    @Test
    void shouldFindSelenideJunit5Code() {

        // Откройте страницу Selenide в Github
        // Перейдите в раздел Wiki проекта
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

        open("https://github.com/");
        $(".search-input").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid=results-list]").first().$("a").click();
        $("ul.UnderlineNav-body a#wiki-tab").click();
        ElementsCollection links = $$("a");
        String expectedLinkText = "Soft Assertions";
        links.find(text(expectedLinkText)).shouldBe(visible);
        links.find(text(expectedLinkText)).parent().$("a").click();
        $("body").shouldHave(text("JUnit5"));

    }
}