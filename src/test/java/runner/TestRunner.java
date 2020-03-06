package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// This CucumberOptions is a plugin that is used to format your test results into the HTML format.
@CucumberOptions
		(
		features = { "classpath:Features" },
        glue =     {"classpath:StepDefinitions"},
        tags =     {"@LoginWithDataDrivenWithSqlFileAndConfigFileReading"},
        plugin =   {"pretty",
                    "html:target/cucumber-html-report",
                    "json:target/cucumber-json-report/cucumber.json",
                    "junit:junit_xml/cucumber.xml"
                   },
        monochrome = true,
        strict=true
        )
		

public class TestRunner extends AbstractTestNGCucumberTests {

}

// There are so many attributes used under plugin ChromeOptions of class TestRunner(extends AbstractTestNgCucumberTests)
// Following are: 
// 1. features attribute: Represents feature files, we have to give two attribute values "classpath" and "Features" 
// 2. glue attribute: represents step definitions file, we have to give two attribute values "classpath" and "StepDefinitions"
// 3. tags attribute: Execute particular feature/stepdefinition file, we have to give name of the feature/stepdefinition file()
// 4. plugin attribute: Generate pretty output reports, we have to give two attribute values "pretty" and "path of the report"
// 5. monochrome attribute:
// 6. strict attribute:

// plugin attribute: 
