package com.shiftedtech.qa.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //tags = { "@smoke,@debug" }, /* debug or smoke test */

        features = "src/test/resources/features/",

        glue = {"com.shiftedtech.qa.steps"},
                //"com.shiftedtech.qa.framework.steps"},

        plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml"
        }
)
public class BDDRunner {
}
