package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int positive = multiplyByAndToInclusive >=0 ? multiplyByAndToInclusive: multiplyByAndToInclusive * (-1);

        if (multiplyByAndToInclusive != 0) {
            while (counter <= positive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        }

    }
}
