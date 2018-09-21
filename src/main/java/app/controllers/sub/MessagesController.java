package app.controllers.sub;

import org.javalite.activeweb.AppController;
import org.javalite.activeweb.annotations.POST;

/**
 * @author igor on 9/21/18.
 */
public class MessagesController extends AppController {

    @POST
    public void index() {
        respond("ok");
    }
    public void multiple() {}
    public void single() {}
}