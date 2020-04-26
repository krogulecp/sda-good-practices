package info.krogulec.sda.goodpractices.solid.liskov;

/**
 * @author krogulecp
 */
class Volonteer extends Employee {

    @Override
    void takeSalary() {
        //złamanie zasany Liskov Substitution Principle
        throw new RuntimeException("not used");
    }
}
