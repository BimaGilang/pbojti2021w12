package js12;
/**
 * BimaGilangL
 */
public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;
    
    public abstract void heal();
    public abstract void destroyed();
    public String getZombieInfo() {
        String info = "";
        return info;
    }
}