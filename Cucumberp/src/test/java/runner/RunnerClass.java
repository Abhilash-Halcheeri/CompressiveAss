package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\abhi8\\eclipse-workspace\\Cucumberp\\features",
glue="stepdefinitions",monochrome=true,dryRun=false,plugin= {"pretty","html:reports/report.html"})
public class RunnerClass {


}
