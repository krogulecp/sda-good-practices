package info.krogulec.sda.goodpractices.solid.openclosed;

import java.math.BigDecimal;

/**
 * @author krogulecp
 */
class SalaryCalculator {

    private final TaxPolicy taxPolicy;

    SalaryCalculator(TaxPolicy taxPolicy) {
        this.taxPolicy = taxPolicy;
    }

    public BigDecimal calculateSalary(Employee employee){
        BigDecimal salaryWithoutTax = employee.getWorkingDays().multiply(employee.getDailyRate());
        return salaryWithoutTax.multiply(BigDecimal.valueOf(1 - taxPolicy.getTax()));
    }

}
