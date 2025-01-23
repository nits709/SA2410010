package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Volumes/Renuka/SA2410010/MyHybridFrameworkBDDPOM/src/test"
		+ "/resources/com/features/"},
					glue= {"com.mycucumber.MyCucumberProject","com.myHooks"})
public class globalRunner {

}



	
	
	
	
	

