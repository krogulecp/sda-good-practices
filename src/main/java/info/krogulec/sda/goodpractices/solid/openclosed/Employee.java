package info.krogulec.sda.goodpractices.solid.openclosed;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author krogulecp
 */
class Employee {
    public BigDecimal getWorkingDays() {
        return BigDecimal.valueOf(new Random(30).nextLong());
    }

    public BigDecimal getDailyRate() {
        return BigDecimal.valueOf(new Random(500).nextLong());
    }
}
