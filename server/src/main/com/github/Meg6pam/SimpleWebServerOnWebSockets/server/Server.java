package main.com.github.Meg6pam.SimpleWebServerOnWebSockets.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Logger;

public class Server {
    private static final Logger logger = Logger.getLogger(Server.class.getName());
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
