package info.krogulec.sda.goodpractices.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Solidier extends Enemy {
    private static final String NAME = "Solidier";
    private static final int POWER = 56;

    public Solidier() {
        super(NAME, POWER);
    }
}
