package info.krogulec.sda.goodpractices.solid.singleresponsibility;

/**
 * @author krogulecp
 */
class User {

    public static void main(String[] args) {
        Email email = new Email();
        email.setFrom("me");
        Sender sender = new EmailSender(email);
    }
}
