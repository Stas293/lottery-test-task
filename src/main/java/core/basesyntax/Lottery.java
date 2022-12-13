package core.basesyntax;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() { // we can remove redundant empty lines
        /*
            Ball ball = new Ball();
            ball.setBallColor(getRandomColor());
            ball.setBallNumber(RANDOM.nextInt(100)); // as we have Random as a constant, we can use it here
            return ball;
        */
        // we can use Builder pattern here to avoid using setters for better understanding of code
        return Ball.builder()
                .setColor(getRandomColor())
                .setNumber(getRandom().nextInt(100))
                .createBall();
    }
}
