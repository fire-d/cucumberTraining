package com.upticklowcross.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooHomePage extends BasePage {

  public YahooHomePage(WebDriver driver) {
    super(driver);
  }

  public YahooHomePage sendKeys(String arg1) {
    driver.findElement(By.id("UHSearchBox")).sendKeys(arg1);
    return new YahooHomePage(driver);
  }

  public YahooSERP search() {
    driver.findElement(By.id("UHSearchWeb")).click();
    return new YahooSERP(driver);
  }

}
