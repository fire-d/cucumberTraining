package com.upticklowcross.cucumberTraining;

import com.upticklowcross.pageObjects.YoutubeHomePage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class YoutubeStepDefinition extends AbstractStepDefinition {
  public static YoutubeHomePage youtube;

  @Given("^I am on youtube$")
  public void i_am_on_youtube() throws Throwable {
    youtube = new YoutubeHomePage(getDriver());
    youtube.navigateToYoutube();
  }

  @After("@youtube")
  public void tearDown() {
    if (getDriver() != null) {
      getDriver().close();
      getDriver().quit();
      youtube=null;
      MusicDefinition.musicPage=null;
      SportDefinition.sportsPage=null;
      driver=null;
    }
  }

}
