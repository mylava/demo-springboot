package statemachine.action;


import statemachine.base.Transition;
import statemachine.message.Message;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
public interface Action {
    void execute(Message message, Transition configurer);
}
