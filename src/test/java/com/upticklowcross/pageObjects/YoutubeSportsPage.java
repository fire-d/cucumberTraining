package com.upticklowcross.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeSportsPage extends BasePage {

  public YoutubeSportsPage(WebDriver driver) {
    super(driver);
  }
  public YoutubeSportsPage checkTitle(){
    WebDriverWait wdw = new WebDriverWait(driver, 10);
    wdw.until(ExpectedConditions.titleContains("Deportes"));
    Assert.assertEquals(
        driver.findElement(By.cssSelector(".logo.masthead-logo-renderer-logo.yt-sprite"))
            .getAttribute("title"),
        "Página principal de YouTube");
    return new YoutubeSportsPage(driver);
  }
}
