package statemachine.biz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import statemachine.constant.PlayerEvent;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameEvent {
    private PlayerEvent playerEvent;
}
