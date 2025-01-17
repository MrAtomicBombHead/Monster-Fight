public class Monster {
    
    private String name;
    private int health;
    private int damage;
    private int score;
    private boolean dead;


    public Monster(String name, int health, int damage, int score) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.score = score;
        dead = false;
    }

    public void hurt(int amount, String damageType) {
        health -= amount;
        if (health <= 0) death();
    }
    private void death() {
        MonsterFight.score += this.score;
        System.out.println("You killed " + name + ". " + score + " points awarded.");
    }

    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }
    public boolean isDead() {
        return dead;
    }
}
