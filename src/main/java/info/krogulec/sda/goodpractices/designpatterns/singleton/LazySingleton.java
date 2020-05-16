package info.krogulec.sda.goodpractices.designpatterns.singleton;

/**
 * @author krogulecp
 */
class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("inicjalizacja...");
    }

    // singleton zabezpiczeony wątkowo
    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class){
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    //metody które coś realizują
}
