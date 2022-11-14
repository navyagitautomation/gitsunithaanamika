package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\feature\\login1.feature",glue={"stepdefnition"},monochrome= true,

plugin= {"pretty","junit:target/jUnit1reports/report.xml"}	
		)

public class runner2 {

}
