package info.krogulec.sda.goodpractices.designpatterns.singleton;

/**
 * @author krogulecp
 */
class NotLazySingleton {

    private static NotLazySingleton instance = new NotLazySingleton();

    private NotLazySingleton(){
        System.out.println("inicjalizacja");
    }

    public static NotLazySingleton getInstance(){
        return instance;
    }
}
