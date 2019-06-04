package statemachine.action;

import statemachine.base.Transition;
import statemachine.message.Message;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
public class JoinAction implements Action {

    @Override
    public void execute(Message message, Transition configurer) {
        System.out.println(message.getPayload());

        System.out.println(configurer.getSource());
        System.out.println(configurer.getTarget());
        System.out.println(configurer.getEvent());
        System.out.println(configurer.getAction());
    }
}
