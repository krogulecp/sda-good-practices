package info.krogulec.sda.goodpractices.solid.isp;

/**
 * @author krogulecp
 */
class BasicTv implements Tv {
    @Override
    public void display() {
        System.out.println("Basic tv plays");
    }

    @Override
    public void connectToInternet() {
        throw new RuntimeException("not implemented");
    }
}
