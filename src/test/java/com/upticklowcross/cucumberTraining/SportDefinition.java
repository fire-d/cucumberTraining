package com.upticklowcross.cucumberTraining;

import com.upticklowcross.pageObjects.YoutubeSportsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SportDefinition extends AbstractStepDefinition {
  public static YoutubeSportsPage sportsPage;

  @When("^I click on sports$")
  public void i_click_on_music() throws Throwable {
    sportsPage = YoutubeStepDefinition.youtube.clickOnSports();
  }

  @Then("^I should see the sports title$")
  public void i_should_see_the_sports_title() throws Throwable {
    sportsPage = sportsPage.checkTitle();
  }
}
