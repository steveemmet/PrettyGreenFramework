package com.shiftedtech.qa.steps;


import com.shiftedtech.qa.framework.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BeforeAfterHook extends StepBase {

    @Before
    public void setup() {

        //ChromeDriverManager.getInstance().setup();
        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @After
    public void teardown(){
        //driver.close();
        //driver.quit();
        DriverFactory.getInstance().removeDriver();
    }


}
