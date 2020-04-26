package info.krogulec.sda.goodpractices.solid.openclosed;

/**
 * @author krogulecp
 */
class GermanTaxPolicy implements TaxPolicy {
    @Override
    public double getTax() {
        return 0.21;
    }
}
