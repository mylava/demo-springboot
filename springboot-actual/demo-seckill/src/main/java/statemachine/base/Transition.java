package statemachine.base;

import lombok.Data;
import lombok.NoArgsConstructor;
import statemachine.action.Action;
import statemachine.constant.PlayerEvent;
import statemachine.constant.RoomState;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
@Data
@NoArgsConstructor
public class Transition {

    private RoomState source = null;
    private RoomState target = null;
    private PlayerEvent event = null;
    private Action action = null, errorAction = null;

    public Transition source(RoomState source) {
        this.source = source;
        return this;
    }

    public Transition event(PlayerEvent event) {
        this.event = event;
        return this;
    }

    public Transition action(Action action) {
        this.action = action;
        return this;
    }

    public Transition action(Action action,
                             Action error) {
        this.action = action;
        this.errorAction = error;
        return null;
    }

    public Transition target(RoomState target) {
        this.target = target;
        return this;
    }

}
