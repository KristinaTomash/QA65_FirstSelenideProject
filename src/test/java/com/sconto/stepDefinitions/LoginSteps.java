package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {
    HomePage home;
    LoginPage login;

    @And("User enters valid data")
    public void enter_valid_data(){
        login = Selenide.page(LoginPage.class);
        login.enterData("noa@gmail.com","Aa12345!");
    }
    @And("User clicks on Anmelden button")
    public void click_on_Anmelden_button(){
        login.clickOnAnmelden();
    }
    @And("User clicks on User icon")
    public void click_on_User_icon(){
        home = Selenide.page(HomePage.class);
        home.clickOnStatusIcon();
        }
        @Then("User verifies his name")
    public void verify_User_name(){
        login.verifyName("Kristina Tomash");
        }
}
