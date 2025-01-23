package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Volumes/Renuka/SA2410010/MyCucumberProject/src/test/resources/"
						+ "com/mycucumber/MyCucumberProject/F04GoogleLinks.feature"},
					glue= {"com.mycucumber.MyCucumberProject"},
					tags = "@Images",
					publish = true)
public class R04GoogleLinks {
		
	/*
	 * Single scenario == @GmailLinks
	 * Multiple Scenario = @GmailLinks or @Images
	 * Skip Scenario = "not @GmailLinks"
	 * All Scenario == "@AllLinks"
	 */
}
