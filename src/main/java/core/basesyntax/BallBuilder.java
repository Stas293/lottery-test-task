package core.basesyntax;

public class BallBuilder {
    private Colors color;
    private int number;

    public BallBuilder setColor(Colors color) {
        this.color = color;
        return this;
    }

    public BallBuilder setNumber(int number) {
        this.number = number;
        return this;
    }

    public Ball createBall() {
        return new Ball(color, number);
    }
}