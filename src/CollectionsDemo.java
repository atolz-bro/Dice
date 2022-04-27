import java.util.LinkedHashSet;

public class CollectionsDemo {

    static int num = check();

    private static int check() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 5;
    }



}
