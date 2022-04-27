import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class CollectDemoPsvm {

    public static void main(String[] args) {
        LinkedHashSet<String> l = new LinkedHashSet<>();
        l.add("Hello");
        l.add("HelLo");
        l.add("Hello");
        System.out.println(l);
        System.out.println(CollectionsDemo.num);
        System.out.println(CollectionsDemo.num);

        l.stream().filter((s)-> s.equals("33")).collect(Collectors.toSet());
    }
}
