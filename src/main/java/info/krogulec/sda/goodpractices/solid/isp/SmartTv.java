package info.krogulec.sda.goodpractices.solid.isp;

/**
 * @author krogulecp
 */
class SmartTv implements Tv, InternetConnectable {
    @Override
    public void display() {
        System.out.println("Smart Tv plays");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Smart Tv connects to internet");
    }
}
