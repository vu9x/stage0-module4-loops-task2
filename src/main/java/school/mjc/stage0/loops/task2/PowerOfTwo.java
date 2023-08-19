package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        int value = 1;

        if (power < 0) {
            System.out.println("too much power");
        }

        while (counter <= power) {
            if (counter != 0) {
                value *= 2;
            }
            System.out.println(value);
            counter++;
        }
    }
}
