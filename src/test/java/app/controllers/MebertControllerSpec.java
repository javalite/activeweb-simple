package app.controllers;

import org.javalite.activeweb.ControllerSpec;
import org.javalite.common.JsonHelper;
import org.junit.Test;

import java.util.Map;

/**
 * @author igor on 4/17/17.
 */
public class MebertControllerSpec extends ControllerSpec {

    @Test
    public void shouldDisplayChildren(){

        request().params("name", "Igor,Polevoy", "name", "Mike,Ebert").get("index");

        String res = responseContent();

        Map person = (Map) JsonHelper.toList(res).get(0);
        a(person.get("first_name")).shouldBeEqual("Mike");
    }
}
