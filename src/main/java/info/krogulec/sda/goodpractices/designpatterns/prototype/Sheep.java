package info.krogulec.sda.goodpractices.designpatterns.prototype;

/**
 * @author krogulecp
 */
class Sheep extends Animal implements Clonable {

    protected Sheep(String name) {
        super(name);
    }

    @Override
    public Animal clone() {
        return new Sheep(getName());
    }
}
