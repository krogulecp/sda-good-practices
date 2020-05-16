package info.krogulec.sda.goodpractices.designpatterns.adapter;

/**
 * @author krogulecp
 */
class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat fishingBoat;

    FishingBoatAdapter(FishingBoat fishingBoat) {
        this.fishingBoat = fishingBoat;
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
