package world.srv.yeahbutstill;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {

        // kalau aku sih array list
        List<String> names = new ArrayList<>();
        List<String> names1 = new LinkedList<>();

        names.add("Dani");
        names.add("Setiawan");
        names.add("Gandes");
        names.add("Yudit");

        names.set(1, "Ika");

        names.remove(0);
        System.out.println(names.get(0));

        for (var value : names) {
            System.out.println(value);
        }

    }

}
