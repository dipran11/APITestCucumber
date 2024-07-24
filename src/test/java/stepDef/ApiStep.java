package stepDef.ApiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiStep {
    @Given("prepare url for {string}")
    public void prepareUrlFor(String arg0) {
    }

    @And("hit api get list user")
    public void hitApiGetListUser() {

    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int arg0) {
    }

    @Then("validation respone body get list users")
    public void validationResponeBodyGetListUsers() {
    }

    @Then("Validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String arg0) {
    }
}
