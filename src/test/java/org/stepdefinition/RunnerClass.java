package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/fblogin.feature",glue = "org.stepdefinition", monochrome = true, dryRun = false, strict = false)
public class RunnerClass {

}
