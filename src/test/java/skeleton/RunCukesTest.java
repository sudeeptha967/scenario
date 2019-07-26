package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin="json:target\\Jsonreport.json")
//tags={"~@regression"}) //ignore regression
//tags={"@login","@regression"})// - AND case
//tags={"@login,@regression"},
//plugin="html:target\\HtmlReport") // OR case
//plugin="json:target\\Jsonreport.json")
//plugin="junit:target\\xmlreport.xml")
public class RunCukesTest {
}
