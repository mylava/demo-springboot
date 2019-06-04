package statemachine.base;

import statemachine.action.EnterAction;
import statemachine.action.JoinAction;
import statemachine.constant.PlayerEvent;
import statemachine.constant.RoomState;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
public class StateMachineConfig {

    public static StateMachine getStateMachine() {
        StateMachine stateMachine = new StateMachine();
        stateConfig(stateMachine.getStateContext());
        transitionConf(stateMachine);
        return stateMachine;
    }

    private static void stateConfig(State state) {
        state.firstState(RoomState.NONE)
                .nextState(RoomState.CREATED)
                .nextState(RoomState.WAITTING)
                .nextState(RoomState.READY)
                .nextState(RoomState.BEGIN)
                .nextState(RoomState.PLAY)
                .nextState(RoomState.END);
    }

    private static void transitionConf(StateMachine stateMachine) {
        stateMachine.addTransition(new Transition()
                    .source(RoomState.NONE).target(RoomState.CREATED)
                    .event(PlayerEvent.ENTER).action(new EnterAction()))
                .addTransition(new Transition()
                    .source(RoomState.CREATED).target(RoomState.WAITTING)
                    .event(PlayerEvent.JOIN).action(new JoinAction()))
                .addTransition(new Transition()
                        .source(RoomState.WAITTING).target(RoomState.READY)
                        .event(PlayerEvent.ENOUGH).action(new JoinAction()))
                .addTransition(new Transition()
                        .source(RoomState.READY).target(RoomState.BEGIN)
                        .event(PlayerEvent.AUTO).action(new JoinAction()))
                .addTransition(new Transition()
                        .source(RoomState.BEGIN).target(RoomState.LASTHANDS)
                        .event(PlayerEvent.RAISEHANDS).action(new JoinAction()));
    }

}
