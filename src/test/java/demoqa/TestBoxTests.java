package demoqa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofMinutes;

import static org.junit.jupiter.api.Assertions.assertTimeout;


public class TestBoxTests {


    @Test
    void fillFormTest() {
        assertTimeout(ofMinutes(3), () -> {
            open("https://demoqa.com/text-box/");
        });

//        $(".main-header").shouldHave(text("Text Box"));
//        $("#userName").setValue("Evgeny Treskin");
//        $("#userEmail").setValue("qwerty@gmail.com");
//        $("#currentAddress").setValue("Some current address 1");
//        $("#permanentAddress").setValue("Some permanent address 2");
//        $("#submit").click();
    }

//    @AfterEach
//    public void tearDown() {
//        Selenide.closeWebDriver();
//    }
}
