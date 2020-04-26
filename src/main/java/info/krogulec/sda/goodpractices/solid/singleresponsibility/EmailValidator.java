package info.krogulec.sda.goodpractices.solid.singleresponsibility;

/**
 * @author krogulecp
 */
class EmailValidator implements Validator {
    private final String message;

    EmailValidator(String message) {
        this.message = message;
    }

    @Override
    public void validate(){
        if (message.contains("kwiatek")){
            System.out.println("sending not permitted");
        } else {
            System.out.println("email valid");
        }
    }
}
