package statemachine.base;

import lombok.Data;
import statemachine.constant.PlayerEvent;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
@Data
public class StateMachine {
    private State stateContext = new State();
    private Map<PlayerEvent,Transition> transitionContext = new LinkedHashMap<>();

    public StateMachine addTransition(Transition transition) {
        transitionContext.put(transition.getEvent(),transition);
        return this;
    }
}
