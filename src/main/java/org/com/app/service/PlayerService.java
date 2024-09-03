package org.com.app.service;

import lombok.extern.slf4j.Slf4j;
import org.com.app.exception.MasterException;
import org.com.app.handler.PlayerHandler;
import org.com.app.models.Player;

@Slf4j
public class PlayerService {

    public static void doComputations() {
        log.info("Control flow went to the service layers, executing the computations");
        try {
            Player player1 = new Player("Player 1");
            Player player2 = new Player("Player 2");
            PlayerHandler handler = new PlayerHandler(player1, player2, 10);
            Thread communicationThread = new Thread(handler);
            communicationThread.start();
            communicationThread.join();
            log.info("Control flow from to the service layers, successfully executed the computations");
        } catch (InterruptedException e) {
            throw new MasterException("InterruptedException");
        } catch (Exception e) {
            throw new MasterException("Unknown reason of exception");
        }
    }
}
