package info.krogulec.sda.goodpractices.solid.openclosed;

import java.math.BigDecimal;

/**
 * @author krogulecp
 */
class SalaryCalculator {

    public BigDecimal calculateSalary(Employee employee, String countryName){
        BigDecimal salaryWithoutTax = employee.getWorkingDays().multiply(employee.getDailyRate());

        if (countryName.equals("Germany")){
            return salaryWithoutTax.multiply(BigDecimal.valueOf(0.79));
        } else if (countryName.equals("Poland")){
            return salaryWithoutTax.multiply(BigDecimal.valueOf(0.81));
        } else {
            throw new RuntimeException("Country unavailable");
        }
    }

}
