package app.config;

import app.controllers.sub.MessagesController;
import org.javalite.activeweb.AbstractRouteConfig;
import org.javalite.activeweb.AppContext;

/**
 * @author igor on 9/21/18.
 */
public class RouteConfig extends AbstractRouteConfig {

    public void init(AppContext appContext) {
        route("/sub/messages/{id}").to(MessagesController.class).action("single").get();
        route("/sub/messages").to(MessagesController.class).action("multiple").get();
    }
}
