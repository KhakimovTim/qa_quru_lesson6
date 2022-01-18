import org.junit.jupiter.api.Test;
public class TestBasePage {
    WebSteps webSteps = new WebSteps();
    @Test
    void testPage() {
        webSteps.openPage()
                .seachPage()
                .clickPage()
                .checkTab()
                .attachPage();
    }
}
