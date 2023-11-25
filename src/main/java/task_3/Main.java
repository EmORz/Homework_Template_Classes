package task_3;

import java.util.ArrayList;
import java.util.List;

/*Искаме да направим програма, в която се играят мачове между отбори от различни
спортове: футбол, волейбол и т.н. За целта имаме клас Player, който се наследява от
FootballPlayer с полета name, age, tackling, speed, scoring и VolleyballPlayer с полета number,
age, block, finish.
Трябва ни клас Team, който съдържа в себе си треньор, списък от играчи и бюджет. И
искаме да си гарантираме, че всеки отбор има играчи само от един и същ спорт - или само
волейболисти или само футболисти. Затова вместо да имаме списък от Player ползваме
шаблонен клас.
Силата на всеки футболен отбор се изчислява като сума от полетата tackling, speed и
scoring на всеки от играчите. Докато силата на волейболните отбори се изчислява като
сума от полетата block и finish на всеки от играчите в отбора.
Създайте в програмата си поне 2 отбора от един и същ спорт и тествайте как работи
изиграването на мач помежду им. При изиграването на мач има и елемент на случайност -
генериране на Random число, което се добавя към силата на отбора.
*/
public class Main {

    public static void main(String[] args) {
        // Създаване на футболни играчи
        FootballPlayer player1 = new FootballPlayer("Player1", 25, 80, 75, 90);
        FootballPlayer player2 = new FootballPlayer("Player2", 28, 85, 70, 88);

        // Създаване на волейболни играчи
        VolleyballPlayer player3 = new VolleyballPlayer("Player3", 22, 7, 95, 85);
        VolleyballPlayer player4 = new VolleyballPlayer("Player4", 24, 12, 90, 88);

        List<FootballPlayer> footballPlayers = new ArrayList<>();
        footballPlayers.add(player1);
        footballPlayers.add(player2);

        List<VolleyballPlayer> volleyballPlayers = new ArrayList<>();
        volleyballPlayers.add(player3);
        volleyballPlayers.add(player4);

        Team<FootballPlayer> teamFootbalPlayers = new Team<>("Footbal coach", footballPlayers, 10_000);
        Team<VolleyballPlayer> teamVolleyballPlayers = new Team<>("Volleyball coach", volleyballPlayers, 9_000);

        double footballTeamStrenght = teamFootbalPlayers.calculateStrenght();
        double volleyballTeamStrenght = teamVolleyballPlayers.calculateStrenght();

        System.out.println("Сила на футболния отбор: " + footballTeamStrenght);
        System.out.println("Сила на волейболния отбор: " + volleyballTeamStrenght);

        if (volleyballTeamStrenght > footballTeamStrenght) {
            System.out.println("Волеболния отбор побеждава");
        } else if (footballTeamStrenght>volleyballTeamStrenght) {
            System.out.println("Футболен отбор побеждава");
        }else {
            System.out.println("Равенство");
        }
    }


}
