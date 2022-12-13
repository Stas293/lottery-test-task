package core.basesyntax;

import java.util.Random;

public class ColorSupplier {// we can eliminate redundant empty lines
    private static final Random RANDOM = new Random(); // we can use Random as a constant to avoid creating new object every time
    public Colors getRandomColor() { // we can use Colors as a return type to avoid using Colors.valueOf many times
                                    // it is better to use getRandomColor() method as non-static as we
                                    // don't use it in static context and ColorSupplier is inherited, so we don`t have to use another instance
        int index = RANDOM.nextInt(Colors.values().length);
        return Colors.values()[index];
    }

    public static Random getRandom() { // the RANDOM field is private, so we have to use getter to access it to preserve encapsulation
        return RANDOM;
    }
}
