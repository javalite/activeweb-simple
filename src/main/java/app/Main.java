package app;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AllowSymLinkAliasChecker;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;

/**
 * Example of starting ActiveWeb app in an embedded Jetty server.
 * Have to run instrumentation before start if not already.
 *
 * @author igor on 3/10/18.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        File warFile = new File("src/main/webapp");
        webapp.setWar(warFile.getAbsolutePath());
        webapp.addAliasCheck(new AllowSymLinkAliasChecker());
        server.setHandler(webapp);
        server.start();
        server.dumpStdErr();
        server.join();
    }
}
