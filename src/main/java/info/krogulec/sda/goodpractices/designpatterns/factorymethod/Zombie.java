package info.krogulec.sda.goodpractices.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Zombie extends Enemy {

    private static final String NAME = "Zombie";
    private static final int POWER = 195;

    public Zombie() {
        super(NAME, POWER);
    }
}