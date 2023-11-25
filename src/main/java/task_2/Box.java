package task_2;
/*2. Да се създаде клас Box<T> с полета: width, length, material и T color. Като цветът е тип T.
Да се предефинира методът toString().
● Да се създадат 2 кутии: едната е с цвят тип String, а другата - Enum клас Colors
● Да се създаде списък ArrayList с поне 3 елемента от кутии с Enum Colors. Да се сортира
този списък.*/
public class Box<T> {
    private int width;
    private int lenght;
    private String material;
    public T color;

    public Box(int width, int lenght, String material, T color) {
        this.width = width;
        this.lenght = lenght;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", material='" + material + '\'' +
                ", color=" + color +
                '}';
    }
}
