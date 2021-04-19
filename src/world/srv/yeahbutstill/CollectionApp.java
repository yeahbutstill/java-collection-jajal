package world.srv.yeahbutstill;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {

    public static void main(String[] args) {

        // A.K.A dynamic array
        Collection<String> names = new ArrayList<>();

        names.add("Dani");
        names.add("Setiawan");
        names.addAll(List.of("Yeahbutstill", "Srv", "World", "The Best"));

        for (var value : names) {
            System.out.println(value);
        }

        System.out.println("=========== REMOVE ============");

        // now lets to remove
        names.remove("Dani");
        names.removeAll(List.of("Srv", "world"));

        for (var values : names) {
            System.out.println(values);
        }

        System.out.println("=========== CHECK ============");

        //now check data collection
        System.out.println(names.contains("Setiawan"));
        System.out.println(names.containsAll(List.of("Yeahbutstill", "World", "The Best")));

    }

}
