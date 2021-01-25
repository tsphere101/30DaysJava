package maze;

public class Player {

    // Field
    String name;
    int score;
    int health;

    // Constructor
    public Player() {

    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
