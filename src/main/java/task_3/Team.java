package task_3;

import java.util.List;
import java.util.Random;

/*Трябва ни клас Team, който съдържа в себе си треньор, списък от играчи и бюджет. И
искаме да си гарантираме, че всеки отбор има играчи само от един и същ спорт - или само
волейболисти или само футболисти. Затова вместо да имаме списък от Player ползваме
шаблонен клас.*/
public class Team<T extends Player> {
    private String coach;
    private List<T> players;
    private double budget;

    public Team(String coach, List<T> players, double budget) {
        this.coach = coach;
        this.players = players;
        this.budget = budget;
    }
    /*Силата на всеки футболен отбор се изчислява като сума от полетата tackling, speed и
scoring на всеки от играчите. Докато силата на волейболните отбори се изчислява като
сума от полетата block и finish на всеки от играчите в отбора.*/

    public double calculateStrenght(){
        double strenght =0;

        for (T player: players
             ) {
            if (player instanceof FootballPlayer) {
                FootballPlayer footballPlayer = (FootballPlayer) player;
                strenght+= footballPlayer.trackling+footballPlayer.scoring+footballPlayer.speed;
            } else if (player instanceof VolleyballPlayer) {
                VolleyballPlayer volleyballPlayer= (VolleyballPlayer)player;
                strenght+=volleyballPlayer.block+volleyballPlayer.finish;
            }
        }
        Random random = new Random();
        int randomNum = random.nextInt(10);

        return strenght+randomNum;
    }
}
