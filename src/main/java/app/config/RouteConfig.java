package app.config;

import app.controllers.MebertController;
import org.javalite.activeweb.AbstractRouteConfig;
import org.javalite.activeweb.AppContext;

/**
 * @author igor on 4/17/17.
 */
public class RouteConfig extends AbstractRouteConfig {
    @Override
    public void init(AppContext appContext) {

        route("/igor").to(MebertController.class);

    }
}
