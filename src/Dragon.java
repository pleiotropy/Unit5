public class Dragon {
    // instance variables
    private int health, strength, level, totalAttack;
    private boolean dead;

    // constructor(s)
    public Dragon() {
        health = 100;
        strength = 1;
        level = 1;
        dead = false;
    }
    // getter/setter methods

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return dead;
    }

    // other methods
    public void takeDamage(int damage) {
        if (dead) {
            System.out.println("The dragon is already dead!");
        }
        else {
            health -= damage;
            if (health > 0) {
                System.out.println("The dragon takes " + damage + " damage and now has " + health + " health.");
            }
            else {
                dead = true;
                health = 0;
                System.out.println("The dragon takes " + damage + " damage and now has " + health + " health.");
                System.out.println("The dragon has been slayed!");
            }
        }
    }

    public int attack() {
        // calculate and print attack details
        int attack = strength * level;
        System.out.println("The dragon attacks for " + attack + " health points!");

        // update the total attack pts and check if it's at least 50 to level up
        totalAttack += attack;
        if (totalAttack >= 50) {
            int gainedLevels = totalAttack / 50;
            level += gainedLevels;
            totalAttack = 0;
            System.out.println("The dragon has reached level " + level + "!");
        }

        return attack;
    }

    public void powerUp(int i) {
        if (i == 1) {
            health *= 2;
            System.out.println("The dragon's health has increased to " + health + "!");
        }
        else {
            strength *= 2;
            System.out.println("The dragon's strength has increased to " + strength + "!");
        }
    }
    public String toString() {
        String str = "Dragon: ";
        str += "\nStrength = " + strength;
        str += "\nHealth = " + health;
        str += "\nLevel = " + level;
        str += "\nDead = " + dead;
        str += "\nAttack Damage = " + totalAttack;
        return str;
    }

}