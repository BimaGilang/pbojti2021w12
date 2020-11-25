package js12;
/**
 * BimaGilangL
 */
public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    public void heal() {
        if (level == 1) {
            health += 0.1;
        } else if (level == 2) {
            health += 0.3;
        } else if (level == 3) {
            health += 0.4;
        }
    }
    public void destroyed() {
        health -= 20 * health / 100;
    }
    public String getZombieInfo() {
        String info = "Walking Zombie Data = ";
        info += "\nHealth = " + health;
        info += "\nLevel = " + level + "\n";
        return info;
    }
}