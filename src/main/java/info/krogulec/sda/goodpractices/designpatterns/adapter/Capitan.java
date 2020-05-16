package info.krogulec.sda.goodpractices.designpatterns.adapter;

/**
 * @author krogulecp
 */
class Capitan {
    private RowingBoat rowingBoat;

    public Capitan(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    void row(){
        rowingBoat.row();
    }
}
