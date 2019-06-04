package statemachine.message;

import statemachine.constant.PlayerEvent;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
public interface Message {
    PlayerEvent getPayload();
}
