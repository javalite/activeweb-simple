package app.websockets;

import org.eclipse.jetty.client.HttpRequest;

import javax.servlet.http.HttpSession;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * @author igor on 4/18/17.
 */

@ServerEndpoint("/echo")
public class EchoServer {


    private HttpSession httpSession;

    public EchoServer(){

        System.out.println("I'm being created!!");
    }


    /**
     * @OnOpen allows us to intercept the creation of a new session.
     * The session class allows us to send data to the user.
     * In the method onOpen, we'll let the user know that the handshake was
     * successful.
     */

    @OnOpen
    public void onOpen(Session session, EndpointConfig config){

        this.httpSession = (HttpSession) config.getUserProperties().get(HttpSession.class.getName());
        HttpRequest req = (HttpRequest) config.getUserProperties().get(HttpRequest.class.getName());




        System.out.println(session.getId() + " has opened a connection");
        try {

            session.getBasicRemote().sendText("Connection Established");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * When a user sends a message to the server, this method will intercept the message
     * and allow us to react to it. For now the message is read as a String.
     */
    @OnMessage
    public void onMessage(String message, Session session){
        System.out.println("Message from " + session.getId() + ": " + message);
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @OnError
    public void onError(Session session, Throwable throwable){
        throwable.printStackTrace();
    }





    /**
     * The user closes the connection.
     *
     * Note: you can't send messages to the client from this method
     */
    @OnClose
    public void onClose(Session session){
        System.out.println("Session " +session.getId()+" has ended");
    }

    //http://stackoverflow.com/questions/27499800/tomcat8-websockets-jsr-356-with-guice-3-0


}
