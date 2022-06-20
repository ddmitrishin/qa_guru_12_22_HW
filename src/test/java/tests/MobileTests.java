package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

@Tag("android")
public class MobileTests extends TestBase {

//    @Test
//    @DisplayName("Check Search input")
//    void searchTest() {
//        back();
//        step("Search BrowserStack in Wikipedia", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
//        });
//
//        step("Verify results", () -> {
//            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(CollectionCondition.sizeGreaterThan(0));
//        });
//
//    }
//
//    @Test
//    @DisplayName("Check content")
//    void openContent() {
//        back();
//        step("Search Beatles in Wikipedia", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Beatles");
//        });
//
//        step("Open content", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
//        });
//
//        step("Verify title", () -> {
//            $(AppiumBy.xpath("//android.widget.TextView[@text='The Beatles']")).shouldHave(Condition.text("The Beatles"));
//        });
//    }

    @Test
    void successfulLoginTest() {
        step("Allow access to device media", ()->{
            $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        });

        step("Press 'Sign in' button", () ->{
           $(AppiumBy.id("com.metallicus.metalapp.development:id/loginButton")).click();
        });

        step("Enter login and password", ()->{
            $(AppiumBy.id("com.metallicus.metalapp.development:id/underline_edit_text")).sendKeys("domic1369@gmail.com");
            $(AppiumBy.id("com.metallicus.metalapp.development:id/password_edit_text")).sendKeys("Metalpay3Test2!");
            $(AppiumBy.id("com.metallicus.metalapp.development:id/continue_btn")).click();
        });

        step("Enter verification code", ()->{
            sleep(1000);
            $(AppiumBy.id("com.metallicus.metalapp.development:id/underline_edit_text")).shouldBe(Condition.visible).sendKeys("000000");
            $(AppiumBy.id("com.metallicus.metalapp.development:id/continue_btn")).click();
        });

        step("Verified 'Sign In'", ()->{
            $(AppiumBy.accessibilityId("$6348")).shouldBe(Condition.visible);
        });
    }

}
