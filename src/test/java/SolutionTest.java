import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SolutionTest {

    @Test
    public void openEnterprisePageTest() {
        step("Открыть сайт GitHub", () ->
                open("https://github.com"));
        step("Навести мышь на пункт меню Solutions", () ->
                $(".header-menu-wrapper").find(byText("Solutions")).hover()
        );
        step("в выпадающем меню Solutions кликнуть на Enterprise", () ->
                $(By.linkText(("Enterprise"))).click()
        );
        step("Check Enterprise page header", () ->
                $$("h4").findBy(text("Increase developer velocity.")).shouldBe(Condition.visible)
        );
    }
}
