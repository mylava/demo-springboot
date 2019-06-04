package statemachine.base;

import statemachine.constant.RoomState;

import java.util.LinkedList;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
public class State {
    private LinkedList<RoomState> stateContextList = new LinkedList();
    private RoomState initial;    //初始状态

    public State firstState(RoomState initial) {
        this.initial = initial ;
        this.stateContextList.add(initial) ;	//首个元素
        return this;
    }

    public State nextState(RoomState state) {
        this.stateContextList.add(state) ;
        return this;
    }
}
