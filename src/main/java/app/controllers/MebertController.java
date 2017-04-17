package app.controllers;

import org.javalite.activeweb.AppController;
import org.javalite.common.Collections;
import org.javalite.common.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.javalite.common.Collections.map;

/**
 * @author igor on 4/17/17.
 */
public class MebertController extends AppController {

    public void index(){


        logInfo("=======" + format());

        List<String> names = params("name");

        List<Map<String,String>> people = new ArrayList<Map<String, String>>();

        for (String name : names) {
            String[] pers =  Util.split(name, ",");
            people.add(Collections.<String, String>map("first_name", pers[0], "last_name", pers[1]));
        }

        view("people", people);

        render("index.json").noLayout().contentType("application/json");

    }
}
