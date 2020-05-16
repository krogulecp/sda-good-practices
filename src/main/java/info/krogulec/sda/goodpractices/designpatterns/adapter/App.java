package info.krogulec.sda.goodpractices.designpatterns.adapter;

/**
 * @author krogulecp
 */
class App {

    public static void main(String[] args) {
        Capitan capitan = new Capitan(new FishingBoatAdapter(new FishingBoat()));
        capitan.row();
    }
}
