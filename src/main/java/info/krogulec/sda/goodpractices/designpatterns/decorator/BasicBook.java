package info.krogulec.sda.goodpractices.designpatterns.decorator;

/**
 * @author krogulecp
 */
class BasicBook implements Book {
    @Override
    public String describe() {
        return "Basic book";
    }
}
