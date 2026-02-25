
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinitions.api_test;
@CucumberOptions(
        features = "src/test/resources/api_test.feature",
        glue = {"src/test/java/stepdefinitions/api_test"},
        plugin = {"pretty","html:target/cucumber-report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
// glue = {"test.java.stepdefinitions.api_test","com.bank.tests.hooks"}
}
