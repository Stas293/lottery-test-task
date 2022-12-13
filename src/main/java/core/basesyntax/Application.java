package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball = new Lottery();
        System.out.println(ball.getRandomBall()); // we can remove toString() method as it is called by default in System.out.println()
        //Lottery ball2 = new Lottery();             // we can use one Lottery object for all balls
        System.out.println(ball.getRandomBall());
        //Lottery ball3 = new Lottery();
        System.out.println(ball.getRandomBall()); // it is better to use Logger instead of System.out.println() in production code
    }
}
