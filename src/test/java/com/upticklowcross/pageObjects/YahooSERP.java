package com.upticklowcross.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooSERP extends BasePage {

  public YahooSERP(WebDriver driver) {
    super(driver);
  }

  public void checkMe(String arg1) throws Throwable{
    WebDriverWait wdw = new WebDriverWait(driver, 10);
    wdw.until(ExpectedConditions.titleContains("queda"));
    Assert.assertEquals(arg1 + " - de b\u00fasqueda", driver.getTitle());
  }
  
}
