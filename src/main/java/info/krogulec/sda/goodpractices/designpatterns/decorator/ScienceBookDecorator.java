package info.krogulec.sda.goodpractices.designpatterns.decorator;

/**
 * @author krogulecp
 */
class ScienceBookDecorator extends BookDecorator {
    public ScienceBookDecorator(Book book) {
        super(book);
    }

    @Override
    public String describe() {
        return "Science " + super.describe();
    }
}
