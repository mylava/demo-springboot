package statemachine.action;

import lombok.Data;
import statemachine.base.Transition;
import statemachine.message.Message;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
@Data
public class EnterAction implements Action {

    @Override
    public void execute(Message message, Transition configurer) {
        System.out.println(message.getPayload());

        System.out.println("source="+configurer.getSource());
        System.out.println("target="+configurer.getTarget());
        System.out.println("event="+configurer.getEvent());
        System.out.println("action="+configurer.getAction());
    }
}
