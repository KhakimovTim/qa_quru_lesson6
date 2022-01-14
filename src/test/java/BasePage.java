import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    @Step("Открытие базовой страницы")
    public BasePage OpenPage() {
        open("https://github.com");
        return this;
    }
    @Step("Поиск страницы")
    public BasePage SeachPage(){
            $("[data-test-selector=nav-search-input]").click();
            $("[data-test-selector=nav-search-input]").setValue("KhakimovTim/qa_quru_lesson6").pressEnter();
        return this;
        }
    @Step("Переход на страницу пользователя")
    public BasePage ClickPage(){
            $(By.linkText("KhakimovTim/qa_quru_lesson6")).click();
        return this;
        }
    @Step("Проверка Issues на странице")
    public BasePage CheckTab() {
        $(withText("Issues")).should();
        return this;
    }
    @Attachment (value = "Screenshot", type = "text/html", fileExtension = "html")
    public byte[] AttachPage(){
        return WebDriverRunner.source().getBytes(StandardCharsets.UTF_8);
    }
}

