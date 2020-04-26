package info.krogulec.sda.goodpractices.solid.liskov;

/**
 * @author krogulecp
 */
class Main {
    public static void main(String[] args) {
        Employee employee = new Volonteer();
        employee.takeSalary();
    }
}
