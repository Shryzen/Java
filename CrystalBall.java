import java.util.Random;

public class CrystalBall {

  /* Instance Methods */
  public void ask(Question question) {
    System.out.println(Thread.currentThread().getName() + " - Good question! You asked: " + question.getQuestion());
    this.think(question);
    System.out.println(Thread.currentThread().getName() + " - Answer: " + this.answer());
  }

  private void think(Question question) {
    System.out.println(Thread.currentThread().getName() + " - Hmm... Thinking");
    try {
      Thread.sleep(this.getSleepTimeInMs(question.getDifficulty()));
    } catch (InterruptedException | IllegalArgumentException e) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + " - Done!");
  }

  private String answer(){
    String[] answers = {
        "Signs point to yes!",
        "Certainly!",
        "No opinion",
        "Answer is a little cloudy. Try again.",
        "Surely.",
        "No.",
        "Signs point to no.",
        "It could very well be!"
    };
    return answers[new Random().nextInt(answers.length)];
  }

  private int getSleepTimeInMs(Question.Difficulty difficulty) {
    if (difficulty == null) {
      throw new IllegalArgumentException("difficulty cannot be null");
    }
    if (difficulty == Question.Difficulty.EASY) return 1000;
    if (difficulty == Question.Difficulty.MEDIUM) return 2000;
    if (difficulty == Question.Difficulty.HARD) return 3000;
    return 500;
  }
}