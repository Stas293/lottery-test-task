package core.basesyntax;

public class Ball {
    //String ballColor; // we have to use enum here
    private final Colors ballColor; // we can make these fields final as they are immutable
    private final int ballNumber; // when we don't have any access modifiers, it means that we have default access modifier
                    // it is better to use private access modifier for all fields for encapsulation

    //public Ball() {
    //} // we don't need this constructor as we have constructor with parameters

    public Ball(Colors color, int number) {
        this.ballColor = color;
        this.ballNumber = number;
    }

    public static BallBuilder builder() { // we can use static method to create new BallBuilder object
        return new BallBuilder();
    }

    // we can eliminate getters and setters as they are not used

    /*
    public Colors getBallColor() {
        return this.ballColor;
    }

    public void setBallColor(Colors color) {
        this.ballColor = color;
    }

    public int getBallNumber() {
        return this.ballNumber;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }
    */

    public String toString() {
        //String ball = "ball"; // ball is not used anywhere, so we can remove it
        return "Ball with number: " + ballNumber + " and color: " + ballColor;
    }
}
