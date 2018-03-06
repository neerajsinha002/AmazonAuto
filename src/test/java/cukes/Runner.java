package cukes;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeSuite;

/**
 * Unit test for simple LoginPage.
 */

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 0,
        //detailedReport = true,
        //detailedAggregatedReport = true,
        overviewReport = true,
        //coverageReport = true,
        //jsonUsageReport = "target/cucumber-usage.json",
       // usageReport = true,
        //toPDF = true,
        //excludeCoverageTags = {"@flaky" },
        //includeCoverageTags = {"@passed" },
        //ReportPrefix = {""},
        outputFolder = "target")
@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
        features = { "./src/test/java/com/github/mkolisnyk/cucumber/features" },
        glue = { "com/github/mkolisnyk/cucumber/steps" },
        tags = {"@consistent"})
class Runner{
    @BeforeSuite
    public void launchURL(){

    }
}
