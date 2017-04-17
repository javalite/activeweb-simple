package app.controllers;

import org.javalite.activeweb.ControllerSpec;
import org.javalite.common.JsonHelper;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.javalite.common.Collections.list;

/**
 * @author igor on 4/17/17.
 */
public class MebertControllerSpec extends ControllerSpec {

    @Test
    public void shouldDisplayChildren(){
        request().params("name",list("Mike,Ebert", "Igor,Polevoy" )).get("index");
        String res = responseContent();
        List<Map> people = JsonHelper.toList(res);
        the(people.size()).shouldBeEqual(2);
        a(people.get(0).get("first_name")).shouldBeEqual("Mike");
        a(people.get(1).get("first_name")).shouldBeEqual("Igor");
    }
}
