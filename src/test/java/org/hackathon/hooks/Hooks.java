package org.hackathon.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.hackathon.base.Base;

public class Hooks {

    Base base;

    @Before
    public void initiate() {
       base =  new Base();
    }

    @After
    public void tearDown() {
        base.closeDriver();
    }
}
