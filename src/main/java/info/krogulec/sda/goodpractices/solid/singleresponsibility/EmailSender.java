package info.krogulec.sda.goodpractices.solid.singleresponsibility;

/**
 * @author krogulecp
 */
class EmailSender implements Sender {
    private final Email email;

    EmailSender(Email email) {
        this.email = email;
    }

    @Override
    public void send(){
        System.out.println("sending email: " + email);
    }
}
