package demoqa;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestBoxTests extends BaseTest {


    @Test
    void fillFormTest() throws InterruptedException {

        open(URL);
        $(".main-header").shouldHave(text("Text Box"));
        $("#userName").setValue("Evgeny Treskin");
        $("#userEmail").setValue("qwerty@mail.ru");
        $("#currentAddress").setValue("Some current address 1");
        $("#permanentAddress").setValue("Some permanent address 2");
        $("#submit").click();
        $("#output").shouldBe(visible);
    }
}
