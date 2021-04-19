package world.srv.yeahbutstill;

import java.util.Iterator;
import java.util.List;

public class IterableApp {

    public static void main(String[] args) {
        
        System.out.println("- this is how to use iterable");
        Iterable<String> names = List.of("Dani", "Stiawan", "One of the best in the world");

        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("=============================");

        System.out.println("- this is how to use iteretor");
        Iterator<String> iteratorNames = names.iterator();

        while(iteratorNames.hasNext()) {
            String name = iteratorNames.next();
            System.out.println(name);
        }

    }

}
