package app.controllers.sub;

import org.javalite.activeweb.AppController;
import org.javalite.activeweb.annotations.POST;
import org.javalite.common.Util;

import java.io.IOException;

/**
 * @author igor on 9/21/18.
 */
public class MessagesController extends AppController {

    @POST
    public void index() throws IOException {
        respond("ok: " + Util.read(getRequestInputStream()) );
    }
    public void multiple() {}
    public void single() {}
}