public class Skeleton extends Monster {
    
    public Skeleton() {
        super("Skeleton", 15, 2, 10);
    }

    @Override public void hurt(int amount, String damageType) {
        if (damageType.equalsIgnoreCase("Slashing")) amount -= 5;
        super.hurt(amount, damageType);
    }
}
