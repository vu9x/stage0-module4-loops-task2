package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int isEven = 0;

        while (isEven <= printTillInclusive) {
            if (isEven % 2 == 0) {
                System.out.println(isEven);
            }
            isEven++;
        }
    }
}
