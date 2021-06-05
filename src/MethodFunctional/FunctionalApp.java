package MethodFunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }

        // foreach biasa
        System.out.println("ForEach biasa");
        for(Integer data : list){
            System.out.print(data + " ");
        }
        System.out.println("\n foreach functional interface");
        // foreach dengan functional interface
        // anaonymous class
        list.forEach(value -> System.out.println(value));

        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return (value <= 5) ? false : true;
            }
        });
        System.out.println("\n" + list);

        // replace with lambda dengan lengkap
        Predicate<String> predicate = (String value) -> {
            return value != null ? false : true;
        };

        // lambda tanpa return dan blok
        Predicate<String> predicate2 = (String value) -> (value != null) ? false : true;

        // lambda tanpa tipe data dari parameter
        Predicate<String> predicate3 = (value) -> (value != null) ? false : true;

        // lambda tanpa () di paramater dan tanpa tipe data
        Predicate<String> predicate4 = value -> (value != null) ? false : true;

        // lambda dengan nama parameter yg berbeda / dapat berubah (optional)
        Predicate<String> predicate5 = nilai -> nilai != null ? true : false;

        System.out.println(predicate5.test("data"));


    }
}
