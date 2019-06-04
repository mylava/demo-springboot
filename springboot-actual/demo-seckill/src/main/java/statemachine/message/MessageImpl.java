package statemachine.message;

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
public class MessageImpl implements Message{
    private PlayerEvent payload;
    @Override
    public PlayerEvent getPayload() {
        return payload;
    }
}
