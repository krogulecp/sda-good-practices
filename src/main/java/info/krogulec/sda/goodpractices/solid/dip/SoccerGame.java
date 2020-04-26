package info.krogulec.sda.goodpractices.solid.dip;

import java.util.List;

/**
 * @author krogulecp
 */
class SoccerGame {
    private final List<SoccerPlayer> players;

    public SoccerGame(List<SoccerPlayer> players) {
        this.players = players;
    }

    void match(){
        players.forEach(SoccerPlayer::play);
    }
}
