package suites

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("stepdefs"),
  format = Array("pretty", "html:target/cucumber-report"),
  tags = Array("@wip")
)
class RunWip {
}