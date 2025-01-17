import java.util.Random;

public class MonsterFight {

    public static int score;
    
    public static void main(String[] args) {
        System.out.println("Running Program");

        Random random = new Random();
        Monster monster;
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(2);
            if (randomNumber == 0) monster = new Zombie();
            if (randomNumber == 1) monster = new Skeleton();
        }
    }
}