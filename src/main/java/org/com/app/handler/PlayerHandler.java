package org.com.app.handler;

import lombok.extern.slf4j.Slf4j;
import org.com.app.models.Player;

@Slf4j
public class PlayerHandler implements Runnable {

    private Player initiator;
    private Player responder;
    private int maxMessages;

    public PlayerHandler(Player initiator, Player responder, int maxMessages) {
        this.initiator = initiator;
        this.responder = responder;
        this.maxMessages = maxMessages;
    }

    @Override
    public void run() {
        String message = "Message";
        for (int i = 0; i < maxMessages; i++) {
            log.info(initiator.getName() + " sends: " + message);
            String response = responder.receiveMessage(message);
            log.info(responder.getName() + " responds: " + response);

        }
        log.info("Communication complete.");
    }
}
