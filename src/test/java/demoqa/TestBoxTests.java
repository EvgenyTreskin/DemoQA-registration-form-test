package demoqa;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestBoxTests extends BaseTest {

    private static final String URL = "/text-box";
    private static final String USER_NAME = "Evgeny Treskin";
    private static final String USER_EMAIL = "qwerty@mail.ru";
    private static final String CURRENT_ADDRESS = "Some current address 1";
    private static final String PERMANENT_ADDRESS = "Some permanent address 2";


    //also we can use @RetryTest() annotation only for Flaky test
    @Test
    void fillFormTest(){

        open(URL);
        $(".main-header").shouldHave(text("Text Box"));
        $("#userName").setValue(USER_NAME);
        $("#userEmail").setValue(USER_EMAIL);
        $("#currentAddress").setValue(CURRENT_ADDRESS);
        $("#permanentAddress").setValue(PERMANENT_ADDRESS);
        $("#submit").click();
        $("#output").shouldBe(visible);
        $("#output").$("#name").shouldHave(text(USER_NAME));
        $("#output").$("#email").shouldHave(text(USER_EMAIL));
        $("#output #currentAddress").shouldHave(text(CURRENT_ADDRESS));
        $("#output #permanentAddress").shouldHave(text(PERMANENT_ADDRESS));
    }
}
