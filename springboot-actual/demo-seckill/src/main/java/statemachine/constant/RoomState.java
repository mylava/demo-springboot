package statemachine.constant;

/**
 * comment:
 *
 * @author: lipengfei
 * @date: 03/06/2019
 */
public enum RoomState {
    /**
     * 游戏的基本状态，开局->等待玩家（AI）->凑齐一桌子->打牌->结束
     */
    NONE,		//无状态
    CREATED,	//进入房间
    BEGIN ,	//开局
    WAITTING,	//等待玩家
    READY,		//凑齐一桌子
    LASTHANDS,	//翻底牌
    PLAY,		//打牌
    END;		//结束
}
