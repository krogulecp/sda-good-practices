package info.krogulec.sda.goodpractices.designpatterns.decorator;

/**
 * @author krogulecp
 */
abstract class BookDecorator implements Book {

    protected Book book;

    public BookDecorator(Book book) {
        this.book = book;
    }

    @Override
    public String describe() {
        return book.describe();
    }
}
