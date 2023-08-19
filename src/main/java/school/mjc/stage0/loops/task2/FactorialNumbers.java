package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int result = 0;

        while (counter <= printToInclusive) {
            if (counter == 0 || counter == 1) {
                result = 1;
            } else {
                result *= counter;
            }

            System.out.println(result);
            counter++;
        }
    }
}
