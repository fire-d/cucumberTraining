package com.upticklowcross.cucumberTraining;

import com.upticklowcross.pageObjects.YahooHomePage;
import com.upticklowcross.pageObjects.YahooSERP;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YahooDefinition extends AbstractStepDefinition {
  public YahooHomePage yahoo;
  public YahooSERP serp;
  @Given("^I am on yahoo$")
  public void i_am_on_yahoo() throws Throwable {
    yahoo=new YahooHomePage(getDriver());
    yahoo.navigateToYahoo();
  }

  @When("^I type ([^\"]*)$")
  public void i_type_something(String arg1) throws Throwable {
    yahoo=yahoo.sendKeys(arg1);
  }

  @When("^I click search$")
  public void i_click_search() throws Throwable {
    serp=yahoo.search();
  }

  @Then("^I should see the ([^\"]*) SERP$")
  public void i_should_see_the_something_SERP(String arg1) throws Throwable {
    serp.checkMe(arg1);
  }
  
  @After("@yahoo")
  public void tearDown() {
    if (getDriver() != null) {
      getDriver().close();
      getDriver().quit();
      yahoo=null;
      serp=null;
      driver=null;
    }
  }
}
