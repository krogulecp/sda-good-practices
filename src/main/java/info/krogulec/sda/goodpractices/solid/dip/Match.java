package info.krogulec.sda.goodpractices.solid.dip;

import java.util.List;

/**
 * @author krogulecp
 */
class Match {
    public static void main(String[] args) {
        new SoccerGame(List.of(new Goalkeeper(), new Midfielder())).match();
    }
}
