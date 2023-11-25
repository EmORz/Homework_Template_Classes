package task_2;
/*2. Да се създаде клас Box<T> с полета: width, length, material и T color. Като цветът е тип T.
Да се предефинира методът toString().
● Да се създадат 2 кутии: едната е с цвят тип String, а другата - Enum клас Colors
● Да се създаде списък ArrayList с поне 3 елемента от кутии с Enum Colors. Да се сортира
този списък.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>(10,5,"Plastic", "Brown");
        Box<Colors> box2 = new Box<>(9,6,"Wood", Colors.BLUE);
        Box<Colors> box3 = new Box<>(10,5,"Metal", Colors.RED);

        ArrayList<Box<Colors>> boxes = new ArrayList<>();
        boxes.add(box2);
        boxes.add(box3);

        System.out.println("Несортиран списък: ");
        for (Box<Colors> box: boxes
             ) {
            System.out.println(
                    box
            );
        }

        System.out.println("Сортиран списък: ");

        Collections.sort(boxes, Comparator.comparingInt(b -> b.color.ordinal()));
        for (Box<Colors> box: boxes
        ) {
            System.out.println(
                    box
            );
        }

    }
}
