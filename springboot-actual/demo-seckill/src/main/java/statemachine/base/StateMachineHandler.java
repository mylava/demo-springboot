package statemachine.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.log4j.Logger;
import statemachine.action.Action;
import statemachine.constant.PlayerEvent;
import statemachine.message.Message;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StateMachineHandler {
    private StateMachine stateMachine;

    /**
     * Handle event with entity.
     * 1、获得当前事件的Transition
     * 2、处理Action
     * 3、校验当前状态是否是从 上一个状态 转变来的（不做实现）
     * 4、变更状态到下一步
     *
     * @param event   the event
     * @param message the message
     * @return true if event was accepted
     */
    public boolean handleEventWithState(Message message, PlayerEvent event) {
        Transition transition = stateMachine.getTransitionContext().get(event);
        if (transition != null) {
            Action action = transition.getAction();
            if (action != null) {
                /**
                 * 1、任务的执行应该为异步执行，可以考虑放入 RingBuffer中处理
                 * 2、启用异步线程并增加线程池处理
                 */
                action.execute(message, transition);
                /**
                 * 修改当前状态，并持久化
                 */
            } else {
                //抛出异常
                Logger.getLogger(this.getClass()).info("Transition's Action is null");
            }
        }
        return stateMachine != null;
    }
}
