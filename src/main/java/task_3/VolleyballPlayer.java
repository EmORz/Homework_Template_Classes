package task_3;
/*number,
age, block, finish.*/
public class VolleyballPlayer extends Player{
    protected int number;
    protected int block;
    protected int finish;

    public VolleyballPlayer(String name, int age, int number, int block, int finish) {
        super(name, age);
        this.number = number;
        this.block = block;
        this.finish = finish;
    }
}

