package info.krogulec.sda.goodpractices.designpatterns.decorator;

/**
 * @author krogulecp
 */
class BookUser {

    public static void main(String[] args) {
        Book book = new BasicBook();

        Book fictionBook = new FictionBookDecorator(book);


        System.out.println("Basic book result: " + book.describe());
        System.out.println("Fiction book result: " + fictionBook.describe());
    }
}
