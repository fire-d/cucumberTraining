package com.upticklowcross.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeMusicPage extends BasePage{

  public YoutubeMusicPage(WebDriver driver) {
    super(driver);
    // TODO Auto-generated constructor stub
  }
  
  public YoutubeMusicPage checkTitle(){
    WebDriverWait wdw = new WebDriverWait(driver, 10);
    wdw.until(ExpectedConditions.titleContains("M\u00fasica"));
    Assert.assertEquals(
        driver.findElement(By.cssSelector(".logo.masthead-logo-renderer-logo.yt-sprite"))
            .getAttribute("title"),
        "Página principal de YouTube");
    return new YoutubeMusicPage(driver);
  }
  
}
