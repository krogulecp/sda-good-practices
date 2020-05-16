package info.krogulec.sda.goodpractices.designpatterns.decorator;

/**
 * @author krogulecp
 */
class FictionBookDecorator extends BookDecorator {
    public FictionBookDecorator(Book book) {
        super(book);
    }

    @Override
    public String describe() {
        return "Fiction " + super.describe();
    }
}
