import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();



  @Test
  public void replaceWord_findsAWordAndReplacesAllThoseWords() {
    App testApp = new App();
    assertEquals("hello universe , cruel universe", testApp.replaceWord("hello world , cruel world", "world", "universe"));
  }
  @Test
  public void replaceWords_findsAWordOrPartialWordAndReplacesAllThoseWords() {
    App testApp = new App();
    assertEquals("walking my dog to the cathedral", testApp.replaceWord("walking my cat to the cathedral", "cat", "dog"));
  }
}
