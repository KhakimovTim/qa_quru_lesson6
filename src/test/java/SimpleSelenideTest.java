import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class SimpleSelenideTest {
    @Test
    void testandListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");
        $("[data-test-selector=nav-search-input]").click();
        $("[data-test-selector=nav-search-input]").setValue("KhakimovTim/qa_quru_lesson6").pressEnter();
        $(By.linkText("KhakimovTim/qa_quru_lesson6")).click();
        $(withText("Issues")).shouldBe(Condition.visible);
    }
}
