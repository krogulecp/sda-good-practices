package info.krogulec.sda.goodpractices.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Main {

    public static void main(String[] args) {
        new World(new RandomEnemyFactory()).createWorld();
    }
}
