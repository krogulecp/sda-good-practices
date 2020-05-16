package info.krogulec.sda.goodpractices.designpatterns.prototype;

/**
 * @author krogulecp
 */
abstract class Animal {
    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
