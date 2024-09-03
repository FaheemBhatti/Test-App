package org.com.app.models;

import java.io.Serializable;

public class Player implements Serializable {

    private String name;
    private int messageCounter;

    public Player(String name) {
        this.name = name;
        this.messageCounter = 0;
    }

    public String getName() {
        return name;
    }

    public String sendMessage(String message) {
        messageCounter++;
        return message + " - " + messageCounter;
    }

    public String receiveMessage(String message) {
        return sendMessage(message);
    }
}

