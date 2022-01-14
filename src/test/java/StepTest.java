import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StepTest {
    @Test
    void StepsTest() {
        step("Открытие страницы",() ->
                open("https://github.com"));
        step("Поиск страницы ",() -> {
            $("[data-test-selector=nav-search-input]").click();
            $("[data-test-selector=nav-search-input]").setValue("KhakimovTim/qa_quru_lesson6").pressEnter();
        });
        step("Переход на страницу пользователя", ()->
                $(By.linkText("KhakimovTim/qa_quru_lesson6")).click());
        step("Проверка Issues на странице", ()-> {
            $(withText("Issues")).should();
        });


    }
}