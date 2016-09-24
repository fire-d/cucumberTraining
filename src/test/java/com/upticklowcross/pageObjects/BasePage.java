package com.upticklowcross.pageObjects;

import org.openqa.selenium.WebDriver;

import com.upticklowcross.cucumberTraining.AbstractStepDefinition;

public abstract class BasePage {
  protected WebDriver driver;
  
  public BasePage(WebDriver driver){
    this.driver=driver;
  }
  
  public YoutubeHomePage navigateToYoutube(){
    driver.navigate().to("https://youtube.com");
    return new YoutubeHomePage(AbstractStepDefinition.getDriver());
  }
  
  public YahooHomePage navigateToYahoo(){
    driver.navigate().to("https://yahoo.com");
    return new YahooHomePage(AbstractStepDefinition.getDriver());
  }
}
