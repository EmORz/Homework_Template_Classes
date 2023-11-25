package org.example.task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*1. Да се създаде списък с имена на филми ArrayList<String>. Да се сортират по азбучен
ред и да се отпечатат.
б) да се сортират по дължина на заглавието
*/
/*"Източни пиеси"
"Тютюн"
"Колекционерът"
"Дървото на живота"
"Другата страна"
"Джендема"
"Белгийската работилница"*/
public class Main {
    public static void main(String[] args) {

        ArrayList<String> listFilms = new ArrayList<>();
        listFilms.add("Тютюн");
        listFilms.add("Източни пиеси");
        listFilms.add("Колекционерът");
        listFilms.add("Дървото на живота");
        listFilms.add("Другата страна");
        listFilms.add("Джендема");
        listFilms.add("Белгийската работилница");

        Collections.sort(listFilms);
        int ind = 1;
        for (String film:listFilms
             ) {
            System.out.println(ind+". "+film);
            ind++;
        }
        ind=1;
        System.out.println("*".repeat(10));


        Collections.sort(listFilms, Comparator.comparing(String::length));

        for (String film:listFilms
        ) {

            System.out.println(ind+". "+film);
            ind++;
        }


    }
}
