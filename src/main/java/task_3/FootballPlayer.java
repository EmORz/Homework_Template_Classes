package task_3;
/*name, age, tackling, speed, scoring*/
public class FootballPlayer extends Player{
    protected int trackling;
    protected int speed;
    protected int scoring;

    public FootballPlayer(String name, int age, int trackling, int speed, int scoring) {
        super(name, age);
        this.trackling = trackling;
        this.speed = speed;
        this.scoring = scoring;
    }
}
