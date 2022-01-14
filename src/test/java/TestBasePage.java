import org.junit.jupiter.api.Test;

public class TestBasePage {
    BasePage basePage = new BasePage();
    @Test
    void testPage(){
        basePage.OpenPage()
                .SeachPage()
                .ClickPage()
                .CheckTab()
                .AttachPage();
    }
}
