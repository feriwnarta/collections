package struktur_set;

import java.util.EnumSet;

public class EnumSetApp {

    public static enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);

        for(Gender gen : genders) {
            System.out.println(gen);
        }



    }
}
