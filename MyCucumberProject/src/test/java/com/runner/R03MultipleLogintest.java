package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Volumes/Renuka/SA2410010/MyCucumberProject/src/test/resources/"
						+ "com/mycucumber/MyCucumberProject/F03MultipleLogintest.feature"},
					glue= {"com.mycucumber.MyCucumberProject"})
public class R03MultipleLogintest {

}
