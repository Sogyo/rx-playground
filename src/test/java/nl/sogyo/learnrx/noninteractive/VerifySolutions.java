package nl.sogyo.learnrx.noninteractive;

public class VerifySolutions extends Verify {

    private Solutions solutions = new Solutions();

    @Override
    public Exercises getExercise() {
        return solutions;
    }
}
