package statemachine;

import statemachine.base.StateMachineConfig;
import statemachine.base.StateMachineHandler;
import statemachine.biz.Game;
import statemachine.constant.PlayerEvent;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
public class Test {

    public static void main(String[] args) {
        StateMachineHandler handler = new StateMachineHandler(StateMachineConfig.getStateMachine());
        Game game = new Game(handler);
        game.change(PlayerEvent.ENTER);
        game.change(PlayerEvent.JOIN);
        game.change(PlayerEvent.ENOUGH);
        game.change(PlayerEvent.AUTO);
        game.change(PlayerEvent.RAISEHANDS);
    }
}
