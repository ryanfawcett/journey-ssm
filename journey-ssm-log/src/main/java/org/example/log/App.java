package org.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        App app = new App();
        app.greeting();
    }

    public void greeting() {
        log.info("Hello World");
    }

}
