public class Question {
    public enum Difficulty { EASY, MEDIUM, HARD }

    private final Difficulty difficulty;
    private final String question;

    public Question(Difficulty difficulty, String question) {
        this.difficulty = difficulty;
        this.question = question;
    }

    public String getQuestion() { return question; }
    public Difficulty getDifficulty() { return difficulty; }
}