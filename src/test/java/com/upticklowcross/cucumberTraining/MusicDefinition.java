package com.upticklowcross.cucumberTraining;

import com.upticklowcross.pageObjects.YoutubeMusicPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MusicDefinition extends AbstractStepDefinition {
  public static YoutubeMusicPage musicPage;

  @When("^I click on music$")
  public void i_click_on_music() throws Throwable {
    musicPage = YoutubeStepDefinition.youtube.clickOnMusic();
  }

  @Then("^I should see the music title$")
  public void i_should_see_the_music_title() throws Throwable {
    musicPage = musicPage.checkTitle();
  }
}
