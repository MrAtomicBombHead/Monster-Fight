import java.util.Random;
import java.util.Scanner;

public class MonsterFight {

    public static int score;
    public static int health;
    
    public static void main(String[] args) {
        System.out.println("Running Program");

        health = 20;

        Random random = new Random();
        Monster monster;
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(2);
            if (randomNumber == 0) monster = new Zombie();
            else monster = new Skeleton();

            if (round(monster)) {
                break;
            };
        }

        if (health <= 0) System.out.println("You lose.");
        else System.out.println("You won!");
        System.out.println("You got " + score + " points.");
    }

    public static boolean round(Monster monster) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A " + monster.getName() + " has spawned. It has " + monster.getHealth() + " health remaining.");

        while (!(monster.isDead())) {
            String weapon;
            String damageType;
            int damage;
            while (true) {
                System.out.println("Use sword or club?");
                weapon = scanner.nextLine();
                if (weapon.equalsIgnoreCase("sword")) {
                    damageType = "Slashing";
                    damage = 8;
                    break;
                }
                if (weapon.equalsIgnoreCase("club")) {
                    damageType = "Bludgeoning";
                    damage = 5;
                    break;
                }
                System.out.println("Invalid. Try again");
            }

            monster.hurt(damage, damageType);
            System.out.println(monster.getName() + " has " + monster.getHealth() + " health remaining.");
            if (monster.isDead()) {
                System.out.println("You killed " + monster.getName() + ".");
                return false;
            }
            health -= monster.getDamage();
            System.out.println(monster.getName() + " did " + monster.getDamage() + " damage. You have " + health + " remaining.");
            if (health <= 0) {
                return true;
            }
        }
        return false;
    }
}