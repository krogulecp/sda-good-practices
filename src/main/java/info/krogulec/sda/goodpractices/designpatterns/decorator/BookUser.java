package info.krogulec.sda.goodpractices.designpatterns.decorator;

/**
 * @author krogulecp
 */
class BookUser {

    public static void main(String[] args) {

        Book fictionBook = new FictionBookDecorator(new ScienceBookDecorator(new BasicBook()));

        System.out.println("Result: " + fictionBook.describe());
    }
}
