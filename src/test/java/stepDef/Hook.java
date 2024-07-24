package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hook {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After All");
    }

    @Before
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @After
    public void afterTest() {
        System.out.println("After Test");
    }
}

