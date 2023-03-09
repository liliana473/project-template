package com.fleet.step_definitions;
import com.fleet.pages.PinBarHelpPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US3_stepDefs {

    PinBarHelpPage pinBarHelpPage = new PinBarHelpPage();

    @When("user click the Learn how to use this space message")
    public void userClickTheLearnHowToUseThisSpaceMessage() {

        pinBarHelpPage.LearnHowToUseThisSpaceButton.click();

    }



    @Then("Verify the users see {string} and {string}:")
    public void verifyTheUsersSeeAnd(String msg1, String msg2) {


        String actualTextmsg1 = pinBarHelpPage.HowToUsePinbarMsg.getText();
        Assert.assertEquals(actualTextmsg1,msg1);


        String actualTextMsg2= pinBarHelpPage.usePinIconMessage.getText();
        Assert.assertEquals(actualTextMsg2,msg2);

    }


    @Then("verify the user see image")
    public void verify_the_user_see_image() {

        pinBarHelpPage.PinPageImage.isDisplayed();

    }


    @Then("verify img source expected as {string}")
    public void verifyImgSourceExpectedAs(String imgsource) {

        String actualSource = pinBarHelpPage.PinPageImage.getAttribute("src");
        Assert.assertEquals(actualSource,imgsource);
    }


}
