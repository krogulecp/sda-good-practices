package info.krogulec.sda.goodpractices.designpatterns.singleton;

/**
 * @author krogulecp
 */
class Main {

    public static void main(String[] args) {
        NotLazySingleton notLazySingleton = NotLazySingleton.getInstance();
        NotLazySingleton notLazySingleton2 = NotLazySingleton.getInstance();
        System.out.println("instancja 1: " + notLazySingleton + " instancja 2: " + notLazySingleton2);
    }
}
