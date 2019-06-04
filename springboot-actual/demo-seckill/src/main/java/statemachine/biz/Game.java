package statemachine.biz;

import statemachine.base.StateMachineHandler;
import statemachine.constant.PlayerEvent;
import statemachine.message.MessageImpl;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
public class Game {
    private final StateMachineHandler handler;

    public Game(StateMachineHandler handler) {
        this.handler = handler;
    }

    public void change(PlayerEvent event) {
        change(event, 0);
    }

    public void change(PlayerEvent event, int interval) {
        handler.handleEventWithState(new MessageImpl(event), event);
    }

    public void change(GameEvent gameEvent) {
        change(gameEvent, 0);
    }

    public void change(GameEvent gameEvent, int interval) {
        handler.handleEventWithState(new MessageImpl(gameEvent.getPlayerEvent()), gameEvent.getPlayerEvent());
    }
}
