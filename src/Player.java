public class Player {

    private String name;
    private int score;
    private int highScore;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void incrementScore() {
        score++;

        if (score > highScore) {
            highScore = score;
        }
    }

    public void reset() {
        score = 0;
    }
}