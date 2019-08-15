package stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest.Matchers
import pages.{BasePage, _}

class StepDefs extends ScalaDsl with EN with Matchers with BasePage {

  Given("""^I am on the Bing home page$""") { () =>
    // Tells webDriver to open a browser to the URL defined within bingUrl
    webDriver.navigate().to(bingUrl)

}
