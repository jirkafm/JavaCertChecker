package com.github.jirkafm;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public final class JavaCertChecker {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Specify webserver with correct URI: java -jar JavaCertChecker.jar https://<webserver>");
            System.exit(1);
        }

        try {
            URI uri = new URI(args[0]);
            uri.toURL().openConnection().connect();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
