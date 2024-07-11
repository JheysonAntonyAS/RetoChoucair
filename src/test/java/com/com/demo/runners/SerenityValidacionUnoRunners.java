package com.com.demo.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ValidacionUno.feature",
        glue = "com.com.demo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[2]/article/div[1]/a/div[2]/div/div[2]/p/text()[2]
//*[@id="__next"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[1]/article/div[1]/a/div[2]/div/div[2]/p/text()[2]
public class SerenityValidacionUnoRunners {
}
