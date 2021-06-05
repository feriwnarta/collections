package struktur_set;

import com.tutorial.collection.Person;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        // navigable set otomatis tersorting

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        NavigableSet<Person> navgable = new TreeSet<>(comparator);
        NavigableSet<Person> navgableReversed = new TreeSet<>(comparator.reversed());
        // navgable.add() - > tambah
        // navgable.descendingSet() - > reversed

        navgable.add(new Person("Feri"));
        navgable.add(new Person("Winarta"));
        navgable.add(new Person("Keren"));

        for(Person result : navgable) {
            System.out.println(result.getName());
        }


        // reversed
        navgableReversed.add(new Person("Feri"));
        navgableReversed.add(new Person("Winarta"));
        navgableReversed.add(new Person("Keren"));
        System.out.println("Reversed");
        for(Person result : navgableReversed) {
            System.out.println(result.getName());
        }

        



    }
}
