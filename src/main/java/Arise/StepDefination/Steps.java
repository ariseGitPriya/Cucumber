package Arise.StepDefination;

import Arise.Base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {


    @Given("Launch the Brawser and navigate to login page")
    public void launch_the_brawser_and_navigate_to_login_page() {
        BaseTest.launchBrawser();
        System.out.println("Brawser is Launching....");
    }
    @When("enter valid username and passward")
    public void enter_valid_username_and_passward() {
        System.out.println("Enter Valid username and Passward....");

    }
    @Then("user should navigate to home page")
    public void user_should_navigate_to_home_page() {
        System.out.println("User should navigate to home page....");
    }

}
