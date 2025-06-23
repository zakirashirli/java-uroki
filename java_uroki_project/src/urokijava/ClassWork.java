package urokijava;

import java.util.Random;

public class ClassWork {
    public static void main(String[] args) {
        Random rnd = new Random(); // random numbers

        String[] names = {"Ali", "Alihandro", "Maryam", "Aflatun", "Elemdar"}; // massive with names
        String[] result_names = new String[names.length]; // new massive with result names

        for (int i = 0; i < names.length; i++) {
            int num = rnd.nextInt(71) + 10;
            result_names[i] = names[i] + num;
        } // adding random numbers to our names

        for (String name : result_names) {
            System.out.println(name);
        } // for each, for output new names massive
    }
}
